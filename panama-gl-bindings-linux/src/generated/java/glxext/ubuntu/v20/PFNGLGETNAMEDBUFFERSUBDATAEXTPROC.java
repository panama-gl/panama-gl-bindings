// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNAMEDBUFFERSUBDATAEXTPROC {

    void apply(int buffer, long offset, long size, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(PFNGLGETNAMEDBUFFERSUBDATAEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDBUFFERSUBDATAEXTPROC.class, fi, constants$657.PFNGLGETNAMEDBUFFERSUBDATAEXTPROC$FUNC, session);
    }
    static PFNGLGETNAMEDBUFFERSUBDATAEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _buffer, long _offset, long _size, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$657.PFNGLGETNAMEDBUFFERSUBDATAEXTPROC$MH.invokeExact((Addressable)symbol, _buffer, _offset, _size, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


