// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GEO_ENUMPROC {

    int apply(int _x0);
    static MemorySegment allocate(GEO_ENUMPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GEO_ENUMPROC.class, fi, constants$540.GEO_ENUMPROC$FUNC, session);
    }
    static GEO_ENUMPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0) -> {
            try {
                return (int)constants$540.GEO_ENUMPROC$MH.invokeExact((Addressable)symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


