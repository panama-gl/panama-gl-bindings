// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMSTRINGARBPROC {

    void apply(int target, int format, int len, java.lang.foreign.MemoryAddress string);
    static MemorySegment allocate(PFNGLPROGRAMSTRINGARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMSTRINGARBPROC.class, fi, constants$408.PFNGLPROGRAMSTRINGARBPROC$FUNC, session);
    }
    static PFNGLPROGRAMSTRINGARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _format, int _len, java.lang.foreign.MemoryAddress _string) -> {
            try {
                constants$408.PFNGLPROGRAMSTRINGARBPROC$MH.invokeExact((Addressable)symbol, _target, _format, _len, (java.lang.foreign.Addressable)_string);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


