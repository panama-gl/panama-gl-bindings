// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCLIENTWAITSYNCPROC {

    int apply(java.lang.foreign.MemoryAddress sync, int flags, long timeout);
    static MemorySegment allocate(PFNGLCLIENTWAITSYNCPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCLIENTWAITSYNCPROC.class, fi, constants$266.PFNGLCLIENTWAITSYNCPROC$FUNC, session);
    }
    static PFNGLCLIENTWAITSYNCPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _sync, int _flags, long _timeout) -> {
            try {
                return (int)constants$266.PFNGLCLIENTWAITSYNCPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_sync, _flags, _timeout);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


