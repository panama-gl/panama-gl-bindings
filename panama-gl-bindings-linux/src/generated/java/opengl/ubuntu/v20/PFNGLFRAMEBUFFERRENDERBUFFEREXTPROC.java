// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC.class, fi, constants$630.PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC.class, fi, constants$630.PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$630.PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


