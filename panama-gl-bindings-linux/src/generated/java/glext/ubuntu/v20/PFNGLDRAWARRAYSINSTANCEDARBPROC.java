// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDRAWARRAYSINSTANCEDARBPROC {

    void apply(int mode, int first, int count, int primcount);
    static MemorySegment allocate(PFNGLDRAWARRAYSINSTANCEDARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDRAWARRAYSINSTANCEDARBPROC.class, fi, constants$322.PFNGLDRAWARRAYSINSTANCEDARBPROC$FUNC, session);
    }
    static PFNGLDRAWARRAYSINSTANCEDARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, int _first, int _count, int _primcount) -> {
            try {
                constants$322.PFNGLDRAWARRAYSINSTANCEDARBPROC$MH.invokeExact((Addressable)symbol, _mode, _first, _count, _primcount);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


