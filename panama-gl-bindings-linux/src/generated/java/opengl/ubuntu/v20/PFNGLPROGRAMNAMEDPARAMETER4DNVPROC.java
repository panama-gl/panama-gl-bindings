// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMNAMEDPARAMETER4DNVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, double x3, double x4, double x5, double x6);
    static MemoryAddress allocate(PFNGLPROGRAMNAMEDPARAMETER4DNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMNAMEDPARAMETER4DNVPROC.class, fi, constants$750.PFNGLPROGRAMNAMEDPARAMETER4DNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;DDDD)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMNAMEDPARAMETER4DNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMNAMEDPARAMETER4DNVPROC.class, fi, constants$750.PFNGLPROGRAMNAMEDPARAMETER4DNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;DDDD)V", scope);
    }
    static PFNGLPROGRAMNAMEDPARAMETER4DNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, double x3, double x4, double x5, double x6) -> {
            try {
                constants$750.PFNGLPROGRAMNAMEDPARAMETER4DNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


