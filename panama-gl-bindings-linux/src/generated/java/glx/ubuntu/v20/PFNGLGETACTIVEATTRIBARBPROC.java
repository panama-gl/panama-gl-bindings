// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETACTIVEATTRIBARBPROC {

    void apply(int programObj, int index, int maxLength, java.lang.foreign.MemoryAddress length, java.lang.foreign.MemoryAddress size, java.lang.foreign.MemoryAddress type, java.lang.foreign.MemoryAddress name);
    static MemorySegment allocate(PFNGLGETACTIVEATTRIBARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETACTIVEATTRIBARBPROC.class, fi, constants$485.PFNGLGETACTIVEATTRIBARBPROC$FUNC, session);
    }
    static PFNGLGETACTIVEATTRIBARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _programObj, int _index, int _maxLength, java.lang.foreign.MemoryAddress _length, java.lang.foreign.MemoryAddress _size, java.lang.foreign.MemoryAddress _type, java.lang.foreign.MemoryAddress _name) -> {
            try {
                constants$485.PFNGLGETACTIVEATTRIBARBPROC$MH.invokeExact((Addressable)symbol, _programObj, _index, _maxLength, (java.lang.foreign.Addressable)_length, (java.lang.foreign.Addressable)_size, (java.lang.foreign.Addressable)_type, (java.lang.foreign.Addressable)_name);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


