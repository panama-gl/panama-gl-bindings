// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORM2I64NVPROC {

    void apply(int x0, int x1, long x2, long x3);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM2I64NVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2I64NVPROC.class, fi, constants$462.PFNGLPROGRAMUNIFORM2I64NVPROC$FUNC, "(IIJJ)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM2I64NVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2I64NVPROC.class, fi, constants$462.PFNGLPROGRAMUNIFORM2I64NVPROC$FUNC, "(IIJJ)V", scope);
    }
    static PFNGLPROGRAMUNIFORM2I64NVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, long x2, long x3) -> {
            try {
                constants$462.PFNGLPROGRAMUNIFORM2I64NVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


