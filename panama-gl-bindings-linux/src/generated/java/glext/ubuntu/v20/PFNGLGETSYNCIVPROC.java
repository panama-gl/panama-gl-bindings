// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETSYNCIVPROC {

    void apply(java.lang.foreign.MemoryAddress sync, int pname, int bufSize, java.lang.foreign.MemoryAddress length, java.lang.foreign.MemoryAddress values);
    static MemorySegment allocate(PFNGLGETSYNCIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETSYNCIVPROC.class, fi, constants$225.PFNGLGETSYNCIVPROC$FUNC, session);
    }
    static PFNGLGETSYNCIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _sync, int _pname, int _bufSize, java.lang.foreign.MemoryAddress _length, java.lang.foreign.MemoryAddress _values) -> {
            try {
                constants$225.PFNGLGETSYNCIVPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_sync, _pname, _bufSize, (java.lang.foreign.Addressable)_length, (java.lang.foreign.Addressable)_values);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


