// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC {

    void apply(int x0, float x1, float x2, float x3, float x4, float x5);
    static MemoryAddress allocate(PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC.class, fi, constants$1012.PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC$FUNC, "(IFFFFF)V");
    }
    static MemoryAddress allocate(PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC.class, fi, constants$1012.PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC$FUNC, "(IFFFFF)V", scope);
    }
    static PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1, float x2, float x3, float x4, float x5) -> {
            try {
                constants$1012.PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


