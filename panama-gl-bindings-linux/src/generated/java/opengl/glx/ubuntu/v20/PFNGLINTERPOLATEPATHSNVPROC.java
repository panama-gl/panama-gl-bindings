// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLINTERPOLATEPATHSNVPROC {

    void apply(int x0, int x1, int x2, float x3);
    static MemoryAddress allocate(PFNGLINTERPOLATEPATHSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLINTERPOLATEPATHSNVPROC.class, fi, constants$875.PFNGLINTERPOLATEPATHSNVPROC$FUNC, "(IIIF)V");
    }
    static MemoryAddress allocate(PFNGLINTERPOLATEPATHSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLINTERPOLATEPATHSNVPROC.class, fi, constants$875.PFNGLINTERPOLATEPATHSNVPROC$FUNC, "(IIIF)V", scope);
    }
    static PFNGLINTERPOLATEPATHSNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, float x3) -> {
            try {
                constants$875.PFNGLINTERPOLATEPATHSNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


