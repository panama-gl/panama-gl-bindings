// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLBINDDISPLAYCOLORTABLEEXTPROC {

    byte apply(short id);
    static MemorySegment allocate(PFNWGLBINDDISPLAYCOLORTABLEEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLBINDDISPLAYCOLORTABLEEXTPROC.class, fi, constants$1387.PFNWGLBINDDISPLAYCOLORTABLEEXTPROC$FUNC, session);
    }
    static PFNWGLBINDDISPLAYCOLORTABLEEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (short _id) -> {
            try {
                return (byte)constants$1387.PFNWGLBINDDISPLAYCOLORTABLEEXTPROC$MH.invokeExact((Addressable)symbol, _id);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


