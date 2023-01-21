// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GLDEBUGPROCARB {

    void apply(int source, int type, int id, int severity, int length, java.lang.foreign.MemoryAddress message, java.lang.foreign.MemoryAddress userParam);
    static MemorySegment allocate(GLDEBUGPROCARB fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GLDEBUGPROCARB.class, fi, constants$319.GLDEBUGPROCARB$FUNC, session);
    }
    static GLDEBUGPROCARB ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _source, int _type, int _id, int _severity, int _length, java.lang.foreign.MemoryAddress _message, java.lang.foreign.MemoryAddress _userParam) -> {
            try {
                constants$319.GLDEBUGPROCARB$MH.invokeExact((Addressable)symbol, _source, _type, _id, _severity, _length, (java.lang.foreign.Addressable)_message, (java.lang.foreign.Addressable)_userParam);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


