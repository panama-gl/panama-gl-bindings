// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORM4DEXTPROC {

    void apply(int x0, int x1, double x2, double x3, double x4, double x5);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM4DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM4DEXTPROC.class, fi, constants$611.PFNGLPROGRAMUNIFORM4DEXTPROC$FUNC, "(IIDDDD)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM4DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM4DEXTPROC.class, fi, constants$611.PFNGLPROGRAMUNIFORM4DEXTPROC$FUNC, "(IIDDDD)V", scope);
    }
    static PFNGLPROGRAMUNIFORM4DEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, double x2, double x3, double x4, double x5) -> {
            try {
                constants$611.PFNGLPROGRAMUNIFORM4DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


