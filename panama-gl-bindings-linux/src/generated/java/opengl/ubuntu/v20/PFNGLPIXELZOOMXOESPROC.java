// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPIXELZOOMXOESPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLPIXELZOOMXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPIXELZOOMXOESPROC.class, fi, constants$439.PFNGLPIXELZOOMXOESPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLPIXELZOOMXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPIXELZOOMXOESPROC.class, fi, constants$439.PFNGLPIXELZOOMXOESPROC$FUNC, "(II)V", scope);
    }
    static PFNGLPIXELZOOMXOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$439.PFNGLPIXELZOOMXOESPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

