// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLREPLACEMENTCODEUIVERTEX3FSUNPROC {

    void apply(int x0, float x1, float x2, float x3);
    static MemoryAddress allocate(PFNGLREPLACEMENTCODEUIVERTEX3FSUNPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUIVERTEX3FSUNPROC.class, fi, constants$923.PFNGLREPLACEMENTCODEUIVERTEX3FSUNPROC$FUNC, "(IFFF)V");
    }
    static MemoryAddress allocate(PFNGLREPLACEMENTCODEUIVERTEX3FSUNPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUIVERTEX3FSUNPROC.class, fi, constants$923.PFNGLREPLACEMENTCODEUIVERTEX3FSUNPROC$FUNC, "(IFFF)V", scope);
    }
    static PFNGLREPLACEMENTCODEUIVERTEX3FSUNPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1, float x2, float x3) -> {
            try {
                constants$923.PFNGLREPLACEMENTCODEUIVERTEX3FSUNPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


