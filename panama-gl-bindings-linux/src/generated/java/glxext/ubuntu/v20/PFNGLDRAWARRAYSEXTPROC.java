// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDRAWARRAYSEXTPROC {

    void apply(int mode, int first, int count);
    static MemorySegment allocate(PFNGLDRAWARRAYSEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDRAWARRAYSEXTPROC.class, fi, constants$761.PFNGLDRAWARRAYSEXTPROC$FUNC, session);
    }
    static PFNGLDRAWARRAYSEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, int _first, int _count) -> {
            try {
                constants$761.PFNGLDRAWARRAYSEXTPROC$MH.invokeExact((Addressable)symbol, _mode, _first, _count);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


