// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDELETEASYNCMARKERSSGIXPROC {

    void apply(int marker, int range);
    static MemorySegment allocate(PFNGLDELETEASYNCMARKERSSGIXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDELETEASYNCMARKERSSGIXPROC.class, fi, constants$977.PFNGLDELETEASYNCMARKERSSGIXPROC$FUNC, session);
    }
    static PFNGLDELETEASYNCMARKERSSGIXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _marker, int _range) -> {
            try {
                constants$977.PFNGLDELETEASYNCMARKERSSGIXPROC$MH.invokeExact((Addressable)symbol, _marker, _range);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

