// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETACTIVEUNIFORMNAMEPROC {

    void apply(int program, int uniformIndex, int bufSize, java.lang.foreign.MemoryAddress length, java.lang.foreign.MemoryAddress uniformName);
    static MemorySegment allocate(PFNGLGETACTIVEUNIFORMNAMEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETACTIVEUNIFORMNAMEPROC.class, fi, constants$217.PFNGLGETACTIVEUNIFORMNAMEPROC$FUNC, session);
    }
    static PFNGLGETACTIVEUNIFORMNAMEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _uniformIndex, int _bufSize, java.lang.foreign.MemoryAddress _length, java.lang.foreign.MemoryAddress _uniformName) -> {
            try {
                constants$218.PFNGLGETACTIVEUNIFORMNAMEPROC$MH.invokeExact((Addressable)symbol, _program, _uniformIndex, _bufSize, (java.lang.foreign.Addressable)_length, (java.lang.foreign.Addressable)_uniformName);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


