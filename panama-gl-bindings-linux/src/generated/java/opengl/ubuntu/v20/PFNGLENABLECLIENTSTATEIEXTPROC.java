// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLENABLECLIENTSTATEIEXTPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLENABLECLIENTSTATEIEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLENABLECLIENTSTATEIEXTPROC.class, fi, constants$589.PFNGLENABLECLIENTSTATEIEXTPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLENABLECLIENTSTATEIEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLENABLECLIENTSTATEIEXTPROC.class, fi, constants$589.PFNGLENABLECLIENTSTATEIEXTPROC$FUNC, "(II)V", scope);
    }
    static PFNGLENABLECLIENTSTATEIEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$589.PFNGLENABLECLIENTSTATEIEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

