// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD2XOESPROC {

    void apply(int texture, int s, int t);
    static MemorySegment allocate(PFNGLMULTITEXCOORD2XOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD2XOESPROC.class, fi, constants$521.PFNGLMULTITEXCOORD2XOESPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD2XOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _s, int _t) -> {
            try {
                constants$521.PFNGLMULTITEXCOORD2XOESPROC$MH.invokeExact((Addressable)symbol, _texture, _s, _t);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


