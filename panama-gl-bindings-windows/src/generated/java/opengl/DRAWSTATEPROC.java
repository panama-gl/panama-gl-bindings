// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface DRAWSTATEPROC {

    int apply(java.lang.foreign.MemoryAddress hdc, long lData, long wData, int cx, int cy);
    static MemorySegment allocate(DRAWSTATEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(DRAWSTATEPROC.class, fi, constants$414.DRAWSTATEPROC$FUNC, session);
    }
    static DRAWSTATEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hdc, long _lData, long _wData, int _cx, int _cy) -> {
            try {
                return (int)constants$415.DRAWSTATEPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hdc, _lData, _wData, _cx, _cy);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


