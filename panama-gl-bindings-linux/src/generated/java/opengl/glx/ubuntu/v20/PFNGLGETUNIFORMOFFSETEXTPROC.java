// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETUNIFORMOFFSETEXTPROC {

    long apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLGETUNIFORMOFFSETEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETUNIFORMOFFSETEXTPROC.class, fi, constants$602.PFNGLGETUNIFORMOFFSETEXTPROC$FUNC, "(II)J");
    }
    static MemoryAddress allocate(PFNGLGETUNIFORMOFFSETEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETUNIFORMOFFSETEXTPROC.class, fi, constants$602.PFNGLGETUNIFORMOFFSETEXTPROC$FUNC, "(II)J", scope);
    }
    static PFNGLGETUNIFORMOFFSETEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                return (long)constants$602.PFNGLGETUNIFORMOFFSETEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

