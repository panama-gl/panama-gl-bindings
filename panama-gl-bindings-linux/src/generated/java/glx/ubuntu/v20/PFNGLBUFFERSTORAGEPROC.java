// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBUFFERSTORAGEPROC {

    void apply(int target, long size, java.lang.foreign.MemoryAddress data, int flags);
    static MemorySegment allocate(PFNGLBUFFERSTORAGEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBUFFERSTORAGEPROC.class, fi, constants$352.PFNGLBUFFERSTORAGEPROC$FUNC, session);
    }
    static PFNGLBUFFERSTORAGEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, long _size, java.lang.foreign.MemoryAddress _data, int _flags) -> {
            try {
                constants$352.PFNGLBUFFERSTORAGEPROC$MH.invokeExact((Addressable)symbol, _target, _size, (java.lang.foreign.Addressable)_data, _flags);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


