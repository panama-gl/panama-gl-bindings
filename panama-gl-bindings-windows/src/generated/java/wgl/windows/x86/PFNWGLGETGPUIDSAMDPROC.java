// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNWGLGETGPUIDSAMDPROC {

    int apply(int maxCount, java.lang.foreign.MemoryAddress ids);
    static MemorySegment allocate(PFNWGLGETGPUIDSAMDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNWGLGETGPUIDSAMDPROC.class, fi, constants$1383.PFNWGLGETGPUIDSAMDPROC$FUNC, session);
    }
    static PFNWGLGETGPUIDSAMDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _maxCount, java.lang.foreign.MemoryAddress _ids) -> {
            try {
                return (int)constants$1383.PFNWGLGETGPUIDSAMDPROC$MH.invokeExact((Addressable)symbol, _maxCount, (java.lang.foreign.Addressable)_ids);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


