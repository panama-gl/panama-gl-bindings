// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXCOORD4BOESPROC {

    void apply(byte s, byte t, byte r, byte q);
    static MemorySegment allocate(PFNGLTEXCOORD4BOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD4BOESPROC.class, fi, constants$496.PFNGLTEXCOORD4BOESPROC$FUNC, session);
    }
    static PFNGLTEXCOORD4BOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (byte _s, byte _t, byte _r, byte _q) -> {
            try {
                constants$496.PFNGLTEXCOORD4BOESPROC$MH.invokeExact((Addressable)symbol, _s, _t, _r, _q);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


