// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLINVALIDATEBUFFERSUBDATAPROC {

    void apply(int buffer, long offset, long length);
    static MemorySegment allocate(PFNGLINVALIDATEBUFFERSUBDATAPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLINVALIDATEBUFFERSUBDATAPROC.class, fi, constants$256.PFNGLINVALIDATEBUFFERSUBDATAPROC$FUNC, session);
    }
    static PFNGLINVALIDATEBUFFERSUBDATAPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _buffer, long _offset, long _length) -> {
            try {
                constants$256.PFNGLINVALIDATEBUFFERSUBDATAPROC$MH.invokeExact((Addressable)symbol, _buffer, _offset, _length);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


