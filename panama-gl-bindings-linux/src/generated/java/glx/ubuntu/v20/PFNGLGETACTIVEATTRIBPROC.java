// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETACTIVEATTRIBPROC {

    void apply(int program, int index, int bufSize, java.lang.foreign.MemoryAddress length, java.lang.foreign.MemoryAddress size, java.lang.foreign.MemoryAddress type, java.lang.foreign.MemoryAddress name);
    static MemorySegment allocate(PFNGLGETACTIVEATTRIBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETACTIVEATTRIBPROC.class, fi, constants$203.PFNGLGETACTIVEATTRIBPROC$FUNC, session);
    }
    static PFNGLGETACTIVEATTRIBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _index, int _bufSize, java.lang.foreign.MemoryAddress _length, java.lang.foreign.MemoryAddress _size, java.lang.foreign.MemoryAddress _type, java.lang.foreign.MemoryAddress _name) -> {
            try {
                constants$203.PFNGLGETACTIVEATTRIBPROC$MH.invokeExact((Addressable)symbol, _program, _index, _bufSize, (java.lang.foreign.Addressable)_length, (java.lang.foreign.Addressable)_size, (java.lang.foreign.Addressable)_type, (java.lang.foreign.Addressable)_name);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


