// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBINORMAL3FEXTPROC {

    void apply(float x0, float x1, float x2);
    static MemoryAddress allocate(PFNGLBINORMAL3FEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINORMAL3FEXTPROC.class, fi, constants$529.PFNGLBINORMAL3FEXTPROC$FUNC, "(FFF)V");
    }
    static MemoryAddress allocate(PFNGLBINORMAL3FEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINORMAL3FEXTPROC.class, fi, constants$529.PFNGLBINORMAL3FEXTPROC$FUNC, "(FFF)V", scope);
    }
    static PFNGLBINORMAL3FEXTPROC ofAddress(MemoryAddress addr) {
        return (float x0, float x1, float x2) -> {
            try {
                constants$529.PFNGLBINORMAL3FEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


