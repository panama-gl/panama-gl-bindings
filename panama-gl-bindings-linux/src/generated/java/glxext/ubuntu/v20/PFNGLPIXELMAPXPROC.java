// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPIXELMAPXPROC {

    void apply(int map, int size, java.lang.foreign.MemoryAddress values);
    static MemorySegment allocate(PFNGLPIXELMAPXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPIXELMAPXPROC.class, fi, constants$523.PFNGLPIXELMAPXPROC$FUNC, session);
    }
    static PFNGLPIXELMAPXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _map, int _size, java.lang.foreign.MemoryAddress _values) -> {
            try {
                constants$523.PFNGLPIXELMAPXPROC$MH.invokeExact((Addressable)symbol, _map, _size, (java.lang.foreign.Addressable)_values);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


