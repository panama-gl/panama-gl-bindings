// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNPIXELMAPFVPROC {

    void apply(int map, int bufSize, java.lang.foreign.MemoryAddress values);
    static MemorySegment allocate(PFNGLGETNPIXELMAPFVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNPIXELMAPFVPROC.class, fi, constants$307.PFNGLGETNPIXELMAPFVPROC$FUNC, session);
    }
    static PFNGLGETNPIXELMAPFVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _map, int _bufSize, java.lang.foreign.MemoryAddress _values) -> {
            try {
                constants$307.PFNGLGETNPIXELMAPFVPROC$MH.invokeExact((Addressable)symbol, _map, _bufSize, (java.lang.foreign.Addressable)_values);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


