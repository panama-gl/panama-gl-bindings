// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GLDEBUGPROCAMD {

    void apply(int id, int category, int severity, int length, java.lang.foreign.MemoryAddress message, java.lang.foreign.MemoryAddress userParam);
    static MemorySegment allocate(GLDEBUGPROCAMD fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GLDEBUGPROCAMD.class, fi, constants$536.GLDEBUGPROCAMD$FUNC, session);
    }
    static GLDEBUGPROCAMD ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id, int _category, int _severity, int _length, java.lang.foreign.MemoryAddress _message, java.lang.foreign.MemoryAddress _userParam) -> {
            try {
                constants$536.GLDEBUGPROCAMD$MH.invokeExact((Addressable)symbol, _id, _category, _severity, _length, (java.lang.foreign.Addressable)_message, (java.lang.foreign.Addressable)_userParam);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


