// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLINVALIDATEBUFFERDATAPROC {

    void apply(int buffer);
    static MemorySegment allocate(PFNGLINVALIDATEBUFFERDATAPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLINVALIDATEBUFFERDATAPROC.class, fi, constants$337.PFNGLINVALIDATEBUFFERDATAPROC$FUNC, session);
    }
    static PFNGLINVALIDATEBUFFERDATAPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _buffer) -> {
            try {
                constants$337.PFNGLINVALIDATEBUFFERDATAPROC$MH.invokeExact((Addressable)symbol, _buffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


