// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLWINDOWPOS3FPROC {

    void apply(float x0, float x1, float x2);
    static MemoryAddress allocate(PFNGLWINDOWPOS3FPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS3FPROC.class, fi, constants$104.PFNGLWINDOWPOS3FPROC$FUNC, "(FFF)V");
    }
    static MemoryAddress allocate(PFNGLWINDOWPOS3FPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS3FPROC.class, fi, constants$104.PFNGLWINDOWPOS3FPROC$FUNC, "(FFF)V", scope);
    }
    static PFNGLWINDOWPOS3FPROC ofAddress(MemoryAddress addr) {
        return (float x0, float x1, float x2) -> {
            try {
                constants$104.PFNGLWINDOWPOS3FPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


