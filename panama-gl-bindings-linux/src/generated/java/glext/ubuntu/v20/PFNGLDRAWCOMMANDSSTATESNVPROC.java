// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDRAWCOMMANDSSTATESNVPROC {

    void apply(int buffer, java.lang.foreign.MemoryAddress indirects, java.lang.foreign.MemoryAddress sizes, java.lang.foreign.MemoryAddress states, java.lang.foreign.MemoryAddress fbos, int count);
    static MemorySegment allocate(PFNGLDRAWCOMMANDSSTATESNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDRAWCOMMANDSSTATESNVPROC.class, fi, constants$1054.PFNGLDRAWCOMMANDSSTATESNVPROC$FUNC, session);
    }
    static PFNGLDRAWCOMMANDSSTATESNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _buffer, java.lang.foreign.MemoryAddress _indirects, java.lang.foreign.MemoryAddress _sizes, java.lang.foreign.MemoryAddress _states, java.lang.foreign.MemoryAddress _fbos, int _count) -> {
            try {
                constants$1054.PFNGLDRAWCOMMANDSSTATESNVPROC$MH.invokeExact((Addressable)symbol, _buffer, (java.lang.foreign.Addressable)_indirects, (java.lang.foreign.Addressable)_sizes, (java.lang.foreign.Addressable)_states, (java.lang.foreign.Addressable)_fbos, _count);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

