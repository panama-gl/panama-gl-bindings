// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMPARAMETER4FNVPROC {

    void apply(int x0, int x1, float x2, float x3, float x4, float x5);
    static MemoryAddress allocate(PFNGLPROGRAMPARAMETER4FNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMPARAMETER4FNVPROC.class, fi, constants$941.PFNGLPROGRAMPARAMETER4FNVPROC$FUNC, "(IIFFFF)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMPARAMETER4FNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMPARAMETER4FNVPROC.class, fi, constants$941.PFNGLPROGRAMPARAMETER4FNVPROC$FUNC, "(IIFFFF)V", scope);
    }
    static PFNGLPROGRAMPARAMETER4FNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, float x2, float x3, float x4, float x5) -> {
            try {
                constants$941.PFNGLPROGRAMPARAMETER4FNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


