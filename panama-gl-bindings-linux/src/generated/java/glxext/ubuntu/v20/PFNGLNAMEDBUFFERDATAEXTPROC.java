// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNAMEDBUFFERDATAEXTPROC {

    void apply(int buffer, long size, java.lang.foreign.MemoryAddress data, int usage);
    static MemorySegment allocate(PFNGLNAMEDBUFFERDATAEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDBUFFERDATAEXTPROC.class, fi, constants$655.PFNGLNAMEDBUFFERDATAEXTPROC$FUNC, session);
    }
    static PFNGLNAMEDBUFFERDATAEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _buffer, long _size, java.lang.foreign.MemoryAddress _data, int _usage) -> {
            try {
                constants$655.PFNGLNAMEDBUFFERDATAEXTPROC$MH.invokeExact((Addressable)symbol, _buffer, _size, (java.lang.foreign.Addressable)_data, _usage);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


