// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETTRANSFORMFEEDBACKVARYINGPROC {

    void apply(int program, int index, int bufSize, java.lang.foreign.MemoryAddress length, java.lang.foreign.MemoryAddress size, java.lang.foreign.MemoryAddress type, java.lang.foreign.MemoryAddress name);
    static MemorySegment allocate(PFNGLGETTRANSFORMFEEDBACKVARYINGPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETTRANSFORMFEEDBACKVARYINGPROC.class, fi, constants$177.PFNGLGETTRANSFORMFEEDBACKVARYINGPROC$FUNC, session);
    }
    static PFNGLGETTRANSFORMFEEDBACKVARYINGPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _index, int _bufSize, java.lang.foreign.MemoryAddress _length, java.lang.foreign.MemoryAddress _size, java.lang.foreign.MemoryAddress _type, java.lang.foreign.MemoryAddress _name) -> {
            try {
                constants$177.PFNGLGETTRANSFORMFEEDBACKVARYINGPROC$MH.invokeExact((Addressable)symbol, _program, _index, _bufSize, (java.lang.foreign.Addressable)_length, (java.lang.foreign.Addressable)_size, (java.lang.foreign.Addressable)_type, (java.lang.foreign.Addressable)_name);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


