// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFREEOBJECTBUFFERATIPROC {

    void apply(int buffer);
    static MemorySegment allocate(PFNGLFREEOBJECTBUFFERATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFREEOBJECTBUFFERATIPROC.class, fi, constants$582.PFNGLFREEOBJECTBUFFERATIPROC$FUNC, session);
    }
    static PFNGLFREEOBJECTBUFFERATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _buffer) -> {
            try {
                constants$582.PFNGLFREEOBJECTBUFFERATIPROC$MH.invokeExact((Addressable)symbol, _buffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


