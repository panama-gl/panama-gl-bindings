// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD4BOESPROC {

    void apply(int texture, byte s, byte t, byte r, byte q);
    static MemorySegment allocate(PFNGLMULTITEXCOORD4BOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD4BOESPROC.class, fi, constants$493.PFNGLMULTITEXCOORD4BOESPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD4BOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, byte _s, byte _t, byte _r, byte _q) -> {
            try {
                constants$493.PFNGLMULTITEXCOORD4BOESPROC$MH.invokeExact((Addressable)symbol, _texture, _s, _t, _r, _q);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


