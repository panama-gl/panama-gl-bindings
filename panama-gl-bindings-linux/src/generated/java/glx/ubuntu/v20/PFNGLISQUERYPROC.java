// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISQUERYPROC {

    byte apply(int id);
    static MemorySegment allocate(PFNGLISQUERYPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISQUERYPROC.class, fi, constants$193.PFNGLISQUERYPROC$FUNC, session);
    }
    static PFNGLISQUERYPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id) -> {
            try {
                return (byte)constants$193.PFNGLISQUERYPROC$MH.invokeExact((Addressable)symbol, _id);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


