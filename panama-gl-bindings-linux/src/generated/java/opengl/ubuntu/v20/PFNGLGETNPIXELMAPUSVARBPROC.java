// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNPIXELMAPUSVARBPROC {

    void apply(int map, int bufSize, java.lang.foreign.MemoryAddress values);
    static MemorySegment allocate(PFNGLGETNPIXELMAPUSVARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNPIXELMAPUSVARBPROC.class, fi, constants$354.PFNGLGETNPIXELMAPUSVARBPROC$FUNC, session);
    }
    static PFNGLGETNPIXELMAPUSVARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _map, int _bufSize, java.lang.foreign.MemoryAddress _values) -> {
            try {
                constants$354.PFNGLGETNPIXELMAPUSVARBPROC$MH.invokeExact((Addressable)symbol, _map, _bufSize, (java.lang.foreign.Addressable)_values);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


