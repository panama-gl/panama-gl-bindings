// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISCOMMANDLISTNVPROC {

    byte apply(int list);
    static MemorySegment allocate(PFNGLISCOMMANDLISTNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISCOMMANDLISTNVPROC.class, fi, constants$736.PFNGLISCOMMANDLISTNVPROC$FUNC, session);
    }
    static PFNGLISCOMMANDLISTNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _list) -> {
            try {
                return (byte)constants$736.PFNGLISCOMMANDLISTNVPROC$MH.invokeExact((Addressable)symbol, _list);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


