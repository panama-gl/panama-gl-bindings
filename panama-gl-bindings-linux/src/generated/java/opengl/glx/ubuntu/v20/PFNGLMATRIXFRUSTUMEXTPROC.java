// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMATRIXFRUSTUMEXTPROC {

    void apply(int x0, double x1, double x2, double x3, double x4, double x5, double x6);
    static MemoryAddress allocate(PFNGLMATRIXFRUSTUMEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXFRUSTUMEXTPROC.class, fi, constants$625.PFNGLMATRIXFRUSTUMEXTPROC$FUNC, "(IDDDDDD)V");
    }
    static MemoryAddress allocate(PFNGLMATRIXFRUSTUMEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXFRUSTUMEXTPROC.class, fi, constants$625.PFNGLMATRIXFRUSTUMEXTPROC$FUNC, "(IDDDDDD)V", scope);
    }
    static PFNGLMATRIXFRUSTUMEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, double x1, double x2, double x3, double x4, double x5, double x6) -> {
            try {
                constants$625.PFNGLMATRIXFRUSTUMEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


