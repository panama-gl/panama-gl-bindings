// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLBEGINFRAMETRACKINGI3DPROC {

    int apply();
    static MemorySegment allocate(PFNWGLBEGINFRAMETRACKINGI3DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLBEGINFRAMETRACKINGI3DPROC.class, fi, constants$1392.PFNWGLBEGINFRAMETRACKINGI3DPROC$FUNC, session);
    }
    static PFNWGLBEGINFRAMETRACKINGI3DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                return (int)constants$1392.PFNWGLBEGINFRAMETRACKINGI3DPROC$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


