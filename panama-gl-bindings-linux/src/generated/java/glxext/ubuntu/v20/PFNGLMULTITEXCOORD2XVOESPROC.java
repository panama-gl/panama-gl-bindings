// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD2XVOESPROC {

    void apply(int texture, java.lang.foreign.MemoryAddress coords);
    static MemorySegment allocate(PFNGLMULTITEXCOORD2XVOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD2XVOESPROC.class, fi, constants$521.PFNGLMULTITEXCOORD2XVOESPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD2XVOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, java.lang.foreign.MemoryAddress _coords) -> {
            try {
                constants$521.PFNGLMULTITEXCOORD2XVOESPROC$MH.invokeExact((Addressable)symbol, _texture, (java.lang.foreign.Addressable)_coords);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

