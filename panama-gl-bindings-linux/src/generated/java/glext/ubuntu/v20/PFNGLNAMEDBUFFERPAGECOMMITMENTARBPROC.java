// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNAMEDBUFFERPAGECOMMITMENTARBPROC {

    void apply(int buffer, long offset, long size, byte commit);
    static MemorySegment allocate(PFNGLNAMEDBUFFERPAGECOMMITMENTARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDBUFFERPAGECOMMITMENTARBPROC.class, fi, constants$373.PFNGLNAMEDBUFFERPAGECOMMITMENTARBPROC$FUNC, session);
    }
    static PFNGLNAMEDBUFFERPAGECOMMITMENTARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _buffer, long _offset, long _size, byte _commit) -> {
            try {
                constants$373.PFNGLNAMEDBUFFERPAGECOMMITMENTARBPROC$MH.invokeExact((Addressable)symbol, _buffer, _offset, _size, _commit);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


