// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LOCALE_ENUMPROCW {

    int apply(java.lang.foreign.MemoryAddress _x0);
    static MemorySegment allocate(LOCALE_ENUMPROCW fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LOCALE_ENUMPROCW.class, fi, constants$534.LOCALE_ENUMPROCW$FUNC, session);
    }
    static LOCALE_ENUMPROCW ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0) -> {
            try {
                return (int)constants$534.LOCALE_ENUMPROCW$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

