// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXCOORD3BOESPROC {

    void apply(byte s, byte t, byte r);
    static MemorySegment allocate(PFNGLTEXCOORD3BOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD3BOESPROC.class, fi, constants$495.PFNGLTEXCOORD3BOESPROC$FUNC, session);
    }
    static PFNGLTEXCOORD3BOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (byte _s, byte _t, byte _r) -> {
            try {
                constants$495.PFNGLTEXCOORD3BOESPROC$MH.invokeExact((Addressable)symbol, _s, _t, _r);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


