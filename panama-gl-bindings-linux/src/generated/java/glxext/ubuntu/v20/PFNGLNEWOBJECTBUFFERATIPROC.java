// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNEWOBJECTBUFFERATIPROC {

    int apply(int size, java.lang.foreign.MemoryAddress pointer, int usage);
    static MemorySegment allocate(PFNGLNEWOBJECTBUFFERATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNEWOBJECTBUFFERATIPROC.class, fi, constants$581.PFNGLNEWOBJECTBUFFERATIPROC$FUNC, session);
    }
    static PFNGLNEWOBJECTBUFFERATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _size, java.lang.foreign.MemoryAddress _pointer, int _usage) -> {
            try {
                return (int)constants$581.PFNGLNEWOBJECTBUFFERATIPROC$MH.invokeExact((Addressable)symbol, _size, (java.lang.foreign.Addressable)_pointer, _usage);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

