// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSTENCILOPSEPARATEPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLSTENCILOPSEPARATEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILOPSEPARATEPROC.class, fi, constants$114.PFNGLSTENCILOPSEPARATEPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLSTENCILOPSEPARATEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILOPSEPARATEPROC.class, fi, constants$114.PFNGLSTENCILOPSEPARATEPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLSTENCILOPSEPARATEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$114.PFNGLSTENCILOPSEPARATEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


