// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBUFFERSUBDATAARBPROC {

    void apply(int target, long offset, long size, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(PFNGLBUFFERSUBDATAARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBUFFERSUBDATAARBPROC.class, fi, constants$468.PFNGLBUFFERSUBDATAARBPROC$FUNC, session);
    }
    static PFNGLBUFFERSUBDATAARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, long _offset, long _size, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$468.PFNGLBUFFERSUBDATAARBPROC$MH.invokeExact((Addressable)symbol, _target, _offset, _size, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


