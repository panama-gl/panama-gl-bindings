// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETPIXELMAPXVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETPIXELMAPXVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETPIXELMAPXVPROC.class, fi, constants$517.PFNGLGETPIXELMAPXVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETPIXELMAPXVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETPIXELMAPXVPROC.class, fi, constants$517.PFNGLGETPIXELMAPXVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETPIXELMAPXVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$517.PFNGLGETPIXELMAPXVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


