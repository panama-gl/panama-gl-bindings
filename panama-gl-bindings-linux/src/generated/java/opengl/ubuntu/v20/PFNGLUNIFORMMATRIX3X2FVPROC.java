// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLUNIFORMMATRIX3X2FVPROC {

    void apply(int x0, int x1, byte x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLUNIFORMMATRIX3X2FVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORMMATRIX3X2FVPROC.class, fi, constants$144.PFNGLUNIFORMMATRIX3X2FVPROC$FUNC, "(IIBLjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORMMATRIX3X2FVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORMMATRIX3X2FVPROC.class, fi, constants$144.PFNGLUNIFORMMATRIX3X2FVPROC$FUNC, "(IIBLjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLUNIFORMMATRIX3X2FVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, byte x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$144.PFNGLUNIFORMMATRIX3X2FVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


