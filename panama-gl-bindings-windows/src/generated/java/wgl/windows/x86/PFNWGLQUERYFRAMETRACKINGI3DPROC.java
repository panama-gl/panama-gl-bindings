// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLQUERYFRAMETRACKINGI3DPROC {

    int apply(java.lang.foreign.MemoryAddress pFrameCount, java.lang.foreign.MemoryAddress pMissedFrames, java.lang.foreign.MemoryAddress pLastMissedUsage);
    static MemorySegment allocate(PFNWGLQUERYFRAMETRACKINGI3DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLQUERYFRAMETRACKINGI3DPROC.class, fi, constants$1402.PFNWGLQUERYFRAMETRACKINGI3DPROC$FUNC, session);
    }
    static PFNWGLQUERYFRAMETRACKINGI3DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pFrameCount, java.lang.foreign.MemoryAddress _pMissedFrames, java.lang.foreign.MemoryAddress _pLastMissedUsage) -> {
            try {
                return (int)constants$1402.PFNWGLQUERYFRAMETRACKINGI3DPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pFrameCount, (java.lang.foreign.Addressable)_pMissedFrames, (java.lang.foreign.Addressable)_pLastMissedUsage);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


