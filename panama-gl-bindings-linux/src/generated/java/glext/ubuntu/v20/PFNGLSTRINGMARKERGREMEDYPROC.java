// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSTRINGMARKERGREMEDYPROC {

    void apply(int len, java.lang.foreign.MemoryAddress string);
    static MemorySegment allocate(PFNGLSTRINGMARKERGREMEDYPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSTRINGMARKERGREMEDYPROC.class, fi, constants$1001.PFNGLSTRINGMARKERGREMEDYPROC$FUNC, session);
    }
    static PFNGLSTRINGMARKERGREMEDYPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _len, java.lang.foreign.MemoryAddress _string) -> {
            try {
                constants$1001.PFNGLSTRINGMARKERGREMEDYPROC$MH.invokeExact((Addressable)symbol, _len, (java.lang.foreign.Addressable)_string);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


