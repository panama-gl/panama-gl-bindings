// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLWINDOWPOS3DARBPROC {

    void apply(double x0, double x1, double x2);
    static MemoryAddress allocate(PFNGLWINDOWPOS3DARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS3DARBPROC.class, fi, constants$403.PFNGLWINDOWPOS3DARBPROC$FUNC, "(DDD)V");
    }
    static MemoryAddress allocate(PFNGLWINDOWPOS3DARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWPOS3DARBPROC.class, fi, constants$403.PFNGLWINDOWPOS3DARBPROC$FUNC, "(DDD)V", scope);
    }
    static PFNGLWINDOWPOS3DARBPROC ofAddress(MemoryAddress addr) {
        return (double x0, double x1, double x2) -> {
            try {
                constants$403.PFNGLWINDOWPOS3DARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


