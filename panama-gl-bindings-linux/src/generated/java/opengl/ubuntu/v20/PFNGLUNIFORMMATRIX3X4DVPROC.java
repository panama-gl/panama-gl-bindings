// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLUNIFORMMATRIX3X4DVPROC {

    void apply(int x0, int x1, byte x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLUNIFORMMATRIX3X4DVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORMMATRIX3X4DVPROC.class, fi, constants$211.PFNGLUNIFORMMATRIX3X4DVPROC$FUNC, "(IIBLjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORMMATRIX3X4DVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORMMATRIX3X4DVPROC.class, fi, constants$211.PFNGLUNIFORMMATRIX3X4DVPROC$FUNC, "(IIBLjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLUNIFORMMATRIX3X4DVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, byte x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$211.PFNGLUNIFORMMATRIX3X4DVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


