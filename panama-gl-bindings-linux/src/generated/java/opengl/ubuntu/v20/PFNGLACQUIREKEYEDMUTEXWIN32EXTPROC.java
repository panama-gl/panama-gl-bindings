// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLACQUIREKEYEDMUTEXWIN32EXTPROC {

    byte apply(int memory, long key, int timeout);
    static MemorySegment allocate(PFNGLACQUIREKEYEDMUTEXWIN32EXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLACQUIREKEYEDMUTEXWIN32EXTPROC.class, fi, constants$697.PFNGLACQUIREKEYEDMUTEXWIN32EXTPROC$FUNC, session);
    }
    static PFNGLACQUIREKEYEDMUTEXWIN32EXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _memory, long _key, int _timeout) -> {
            try {
                return (byte)constants$697.PFNGLACQUIREKEYEDMUTEXWIN32EXTPROC$MH.invokeExact((Addressable)symbol, _memory, _key, _timeout);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


