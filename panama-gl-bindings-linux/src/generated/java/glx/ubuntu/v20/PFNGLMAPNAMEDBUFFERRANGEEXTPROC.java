// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMAPNAMEDBUFFERRANGEEXTPROC {

    java.lang.foreign.Addressable apply(int buffer, long offset, long length, int access);
    static MemorySegment allocate(PFNGLMAPNAMEDBUFFERRANGEEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMAPNAMEDBUFFERRANGEEXTPROC.class, fi, constants$693.PFNGLMAPNAMEDBUFFERRANGEEXTPROC$FUNC, session);
    }
    static PFNGLMAPNAMEDBUFFERRANGEEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _buffer, long _offset, long _length, int _access) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$693.PFNGLMAPNAMEDBUFFERRANGEEXTPROC$MH.invokeExact((Addressable)symbol, _buffer, _offset, _length, _access);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


