// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD4XVOESPROC {

    void apply(int texture, java.lang.foreign.MemoryAddress coords);
    static MemorySegment allocate(PFNGLMULTITEXCOORD4XVOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD4XVOESPROC.class, fi, constants$597.PFNGLMULTITEXCOORD4XVOESPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD4XVOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, java.lang.foreign.MemoryAddress _coords) -> {
            try {
                constants$598.PFNGLMULTITEXCOORD4XVOESPROC$MH.invokeExact((Addressable)symbol, _texture, (java.lang.foreign.Addressable)_coords);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


