// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSTOPINSTRUMENTSSGIXPROC {

    void apply(int marker);
    static MemorySegment allocate(PFNGLSTOPINSTRUMENTSSGIXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSTOPINSTRUMENTSSGIXPROC.class, fi, constants$1304.PFNGLSTOPINSTRUMENTSSGIXPROC$FUNC, session);
    }
    static PFNGLSTOPINSTRUMENTSSGIXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _marker) -> {
            try {
                constants$1304.PFNGLSTOPINSTRUMENTSSGIXPROC$MH.invokeExact((Addressable)symbol, _marker);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


