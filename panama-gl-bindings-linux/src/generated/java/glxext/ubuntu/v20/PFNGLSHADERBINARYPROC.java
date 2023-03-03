// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSHADERBINARYPROC {

    void apply(int count, java.lang.foreign.MemoryAddress shaders, int binaryformat, java.lang.foreign.MemoryAddress binary, int length);
    static MemorySegment allocate(PFNGLSHADERBINARYPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSHADERBINARYPROC.class, fi, constants$305.PFNGLSHADERBINARYPROC$FUNC, session);
    }
    static PFNGLSHADERBINARYPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _count, java.lang.foreign.MemoryAddress _shaders, int _binaryformat, java.lang.foreign.MemoryAddress _binary, int _length) -> {
            try {
                constants$305.PFNGLSHADERBINARYPROC$MH.invokeExact((Addressable)symbol, _count, (java.lang.foreign.Addressable)_shaders, _binaryformat, (java.lang.foreign.Addressable)_binary, _length);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

