// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBLENDCOLORPROC {

    void apply(float x0, float x1, float x2, float x3);
    static MemoryAddress allocate(PFNGLBLENDCOLORPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBLENDCOLORPROC.class, fi, constants$106.PFNGLBLENDCOLORPROC$FUNC, "(FFFF)V");
    }
    static MemoryAddress allocate(PFNGLBLENDCOLORPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBLENDCOLORPROC.class, fi, constants$106.PFNGLBLENDCOLORPROC$FUNC, "(FFFF)V", scope);
    }
    static PFNGLBLENDCOLORPROC ofAddress(MemoryAddress addr) {
        return (float x0, float x1, float x2, float x3) -> {
            try {
                constants$106.PFNGLBLENDCOLORPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


