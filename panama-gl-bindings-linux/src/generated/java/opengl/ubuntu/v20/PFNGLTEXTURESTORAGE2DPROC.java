// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXTURESTORAGE2DPROC {

    void apply(int x0, int x1, int x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLTEXTURESTORAGE2DPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGE2DPROC.class, fi, constants$286.PFNGLTEXTURESTORAGE2DPROC$FUNC, "(IIIII)V");
    }
    static MemoryAddress allocate(PFNGLTEXTURESTORAGE2DPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGE2DPROC.class, fi, constants$286.PFNGLTEXTURESTORAGE2DPROC$FUNC, "(IIIII)V", scope);
    }
    static PFNGLTEXTURESTORAGE2DPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4) -> {
            try {
                constants$286.PFNGLTEXTURESTORAGE2DPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


