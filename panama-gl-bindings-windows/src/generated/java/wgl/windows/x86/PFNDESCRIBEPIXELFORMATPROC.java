// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNDESCRIBEPIXELFORMATPROC {

    int apply(java.lang.foreign.MemoryAddress hdc, int ipfd, int cjpfd, java.lang.foreign.MemoryAddress ppfd);
    static MemorySegment allocate(PFNDESCRIBEPIXELFORMATPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNDESCRIBEPIXELFORMATPROC.class, fi, constants$1368.PFNDESCRIBEPIXELFORMATPROC$FUNC, session);
    }
    static PFNDESCRIBEPIXELFORMATPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hdc, int _ipfd, int _cjpfd, java.lang.foreign.MemoryAddress _ppfd) -> {
            try {
                return (int)constants$1368.PFNDESCRIBEPIXELFORMATPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hdc, _ipfd, _cjpfd, (java.lang.foreign.Addressable)_ppfd);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


