// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDRAWARRAYSINDIRECTPROC {

    void apply(int mode, java.lang.foreign.MemoryAddress indirect);
    static MemorySegment allocate(PFNGLDRAWARRAYSINDIRECTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDRAWARRAYSINDIRECTPROC.class, fi, constants$205.PFNGLDRAWARRAYSINDIRECTPROC$FUNC, session);
    }
    static PFNGLDRAWARRAYSINDIRECTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, java.lang.foreign.MemoryAddress _indirect) -> {
            try {
                constants$205.PFNGLDRAWARRAYSINDIRECTPROC$MH.invokeExact((Addressable)symbol, _mode, (java.lang.foreign.Addressable)_indirect);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


