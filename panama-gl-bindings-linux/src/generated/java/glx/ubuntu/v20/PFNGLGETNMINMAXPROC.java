// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNMINMAXPROC {

    void apply(int target, byte reset, int format, int type, int bufSize, java.lang.foreign.MemoryAddress values);
    static MemorySegment allocate(PFNGLGETNMINMAXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNMINMAXPROC.class, fi, constants$395.PFNGLGETNMINMAXPROC$FUNC, session);
    }
    static PFNGLGETNMINMAXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, byte _reset, int _format, int _type, int _bufSize, java.lang.foreign.MemoryAddress _values) -> {
            try {
                constants$395.PFNGLGETNMINMAXPROC$MH.invokeExact((Addressable)symbol, _target, _reset, _format, _type, _bufSize, (java.lang.foreign.Addressable)_values);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

