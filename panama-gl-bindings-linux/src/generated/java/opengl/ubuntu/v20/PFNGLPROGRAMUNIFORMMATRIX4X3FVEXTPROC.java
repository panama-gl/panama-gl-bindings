// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROC {

    void apply(int x0, int x1, int x2, byte x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROC.class, fi, constants$580.PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROC$FUNC, "(IIIBLjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROC.class, fi, constants$580.PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROC$FUNC, "(IIIBLjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, byte x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$580.PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


