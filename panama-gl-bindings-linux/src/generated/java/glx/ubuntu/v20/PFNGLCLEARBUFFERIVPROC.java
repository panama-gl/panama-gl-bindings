// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCLEARBUFFERIVPROC {

    void apply(int buffer, int drawbuffer, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLCLEARBUFFERIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCLEARBUFFERIVPROC.class, fi, constants$249.PFNGLCLEARBUFFERIVPROC$FUNC, session);
    }
    static PFNGLCLEARBUFFERIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _buffer, int _drawbuffer, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$249.PFNGLCLEARBUFFERIVPROC$MH.invokeExact((Addressable)symbol, _buffer, _drawbuffer, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


