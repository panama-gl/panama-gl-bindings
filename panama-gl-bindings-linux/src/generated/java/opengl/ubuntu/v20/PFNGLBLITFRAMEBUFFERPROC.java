// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBLITFRAMEBUFFERPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9);
    static MemoryAddress allocate(PFNGLBLITFRAMEBUFFERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBLITFRAMEBUFFERPROC.class, fi, constants$171.PFNGLBLITFRAMEBUFFERPROC$FUNC, "(IIIIIIIIII)V");
    }
    static MemoryAddress allocate(PFNGLBLITFRAMEBUFFERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBLITFRAMEBUFFERPROC.class, fi, constants$171.PFNGLBLITFRAMEBUFFERPROC$FUNC, "(IIIIIIIIII)V", scope);
    }
    static PFNGLBLITFRAMEBUFFERPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9) -> {
            try {
                constants$171.PFNGLBLITFRAMEBUFFERPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8, x9);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


