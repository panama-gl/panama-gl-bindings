// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLGETGAMMATABLEI3DPROC {

    int apply(java.lang.foreign.MemoryAddress hDC, int iEntries, java.lang.foreign.MemoryAddress puRed, java.lang.foreign.MemoryAddress puGreen, java.lang.foreign.MemoryAddress puBlue);
    static MemorySegment allocate(PFNWGLGETGAMMATABLEI3DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLGETGAMMATABLEI3DPROC.class, fi, constants$1393.PFNWGLGETGAMMATABLEI3DPROC$FUNC, session);
    }
    static PFNWGLGETGAMMATABLEI3DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hDC, int _iEntries, java.lang.foreign.MemoryAddress _puRed, java.lang.foreign.MemoryAddress _puGreen, java.lang.foreign.MemoryAddress _puBlue) -> {
            try {
                return (int)constants$1393.PFNWGLGETGAMMATABLEI3DPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hDC, _iEntries, (java.lang.foreign.Addressable)_puRed, (java.lang.foreign.Addressable)_puGreen, (java.lang.foreign.Addressable)_puBlue);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


