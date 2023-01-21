// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOPYNAMEDBUFFERSUBDATAPROC {

    void apply(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size);
    static MemorySegment allocate(PFNGLCOPYNAMEDBUFFERSUBDATAPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOPYNAMEDBUFFERSUBDATAPROC.class, fi, constants$359.PFNGLCOPYNAMEDBUFFERSUBDATAPROC$FUNC, session);
    }
    static PFNGLCOPYNAMEDBUFFERSUBDATAPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _readBuffer, int _writeBuffer, long _readOffset, long _writeOffset, long _size) -> {
            try {
                constants$359.PFNGLCOPYNAMEDBUFFERSUBDATAPROC$MH.invokeExact((Addressable)symbol, _readBuffer, _writeBuffer, _readOffset, _writeOffset, _size);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


