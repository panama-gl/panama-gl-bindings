// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDELETEPERFMONITORSAMDPROC {

    void apply(int n, java.lang.foreign.MemoryAddress monitors);
    static MemorySegment allocate(PFNGLDELETEPERFMONITORSAMDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDELETEPERFMONITORSAMDPROC.class, fi, constants$471.PFNGLDELETEPERFMONITORSAMDPROC$FUNC, session);
    }
    static PFNGLDELETEPERFMONITORSAMDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, java.lang.foreign.MemoryAddress _monitors) -> {
            try {
                constants$471.PFNGLDELETEPERFMONITORSAMDPROC$MH.invokeExact((Addressable)symbol, _n, (java.lang.foreign.Addressable)_monitors);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


