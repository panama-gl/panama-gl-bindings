// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORM2DPROC {

    void apply(int x0, int x1, double x2, double x3);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM2DPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2DPROC.class, fi, constants$228.PFNGLPROGRAMUNIFORM2DPROC$FUNC, "(IIDD)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM2DPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2DPROC.class, fi, constants$228.PFNGLPROGRAMUNIFORM2DPROC$FUNC, "(IIDD)V", scope);
    }
    static PFNGLPROGRAMUNIFORM2DPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, double x2, double x3) -> {
            try {
                constants$228.PFNGLPROGRAMUNIFORM2DPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

