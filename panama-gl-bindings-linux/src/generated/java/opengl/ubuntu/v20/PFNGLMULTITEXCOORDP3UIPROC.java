// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORDP3UIPROC {

    void apply(int texture, int type, int coords);
    static MemorySegment allocate(PFNGLMULTITEXCOORDP3UIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORDP3UIPROC.class, fi, constants$200.PFNGLMULTITEXCOORDP3UIPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORDP3UIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _type, int _coords) -> {
            try {
                constants$200.PFNGLMULTITEXCOORDP3UIPROC$MH.invokeExact((Addressable)symbol, _texture, _type, _coords);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


