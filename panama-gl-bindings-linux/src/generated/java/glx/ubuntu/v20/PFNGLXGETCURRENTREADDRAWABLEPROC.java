// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXGETCURRENTREADDRAWABLEPROC {

    long apply();
    static MemorySegment allocate(PFNGLXGETCURRENTREADDRAWABLEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXGETCURRENTREADDRAWABLEPROC.class, fi, constants$1025.PFNGLXGETCURRENTREADDRAWABLEPROC$FUNC, session);
    }
    static PFNGLXGETCURRENTREADDRAWABLEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                return (long)constants$1026.PFNGLXGETCURRENTREADDRAWABLEPROC$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


