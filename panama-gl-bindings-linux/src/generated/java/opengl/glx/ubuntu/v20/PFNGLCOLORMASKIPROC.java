// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOLORMASKIPROC {

    void apply(int x0, byte x1, byte x2, byte x3, byte x4);
    static MemoryAddress allocate(PFNGLCOLORMASKIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOLORMASKIPROC.class, fi, constants$231.PFNGLCOLORMASKIPROC$FUNC, "(IBBBB)V");
    }
    static MemoryAddress allocate(PFNGLCOLORMASKIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOLORMASKIPROC.class, fi, constants$231.PFNGLCOLORMASKIPROC$FUNC, "(IBBBB)V", scope);
    }
    static PFNGLCOLORMASKIPROC ofAddress(MemoryAddress addr) {
        return (int x0, byte x1, byte x2, byte x3, byte x4) -> {
            try {
                constants$231.PFNGLCOLORMASKIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

