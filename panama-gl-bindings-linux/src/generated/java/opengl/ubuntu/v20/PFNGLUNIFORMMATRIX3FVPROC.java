// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLUNIFORMMATRIX3FVPROC {

    void apply(int x0, int x1, byte x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLUNIFORMMATRIX3FVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORMMATRIX3FVPROC.class, fi, constants$131.PFNGLUNIFORMMATRIX3FVPROC$FUNC, "(IIBLjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORMMATRIX3FVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORMMATRIX3FVPROC.class, fi, constants$131.PFNGLUNIFORMMATRIX3FVPROC$FUNC, "(IIBLjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLUNIFORMMATRIX3FVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, byte x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$131.PFNGLUNIFORMMATRIX3FVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


