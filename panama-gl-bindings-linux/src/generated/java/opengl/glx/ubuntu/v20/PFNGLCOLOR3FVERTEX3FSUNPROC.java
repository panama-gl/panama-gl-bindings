// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOLOR3FVERTEX3FSUNPROC {

    void apply(float x0, float x1, float x2, float x3, float x4, float x5);
    static MemoryAddress allocate(PFNGLCOLOR3FVERTEX3FSUNPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOLOR3FVERTEX3FSUNPROC.class, fi, constants$1002.PFNGLCOLOR3FVERTEX3FSUNPROC$FUNC, "(FFFFFF)V");
    }
    static MemoryAddress allocate(PFNGLCOLOR3FVERTEX3FSUNPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOLOR3FVERTEX3FSUNPROC.class, fi, constants$1002.PFNGLCOLOR3FVERTEX3FSUNPROC$FUNC, "(FFFFFF)V", scope);
    }
    static PFNGLCOLOR3FVERTEX3FSUNPROC ofAddress(MemoryAddress addr) {
        return (float x0, float x1, float x2, float x3, float x4, float x5) -> {
            try {
                constants$1002.PFNGLCOLOR3FVERTEX3FSUNPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

