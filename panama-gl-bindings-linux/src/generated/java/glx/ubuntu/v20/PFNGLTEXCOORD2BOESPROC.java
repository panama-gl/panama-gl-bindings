// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXCOORD2BOESPROC {

    void apply(byte s, byte t);
    static MemorySegment allocate(PFNGLTEXCOORD2BOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD2BOESPROC.class, fi, constants$495.PFNGLTEXCOORD2BOESPROC$FUNC, session);
    }
    static PFNGLTEXCOORD2BOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (byte _s, byte _t) -> {
            try {
                constants$495.PFNGLTEXCOORD2BOESPROC$MH.invokeExact((Addressable)symbol, _s, _t);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

