// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSHADERSOURCEPROC {

    void apply(int shader, int count, java.lang.foreign.MemoryAddress string, java.lang.foreign.MemoryAddress length);
    static MemorySegment allocate(PFNGLSHADERSOURCEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSHADERSOURCEPROC.class, fi, constants$135.PFNGLSHADERSOURCEPROC$FUNC, session);
    }
    static PFNGLSHADERSOURCEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _shader, int _count, java.lang.foreign.MemoryAddress _string, java.lang.foreign.MemoryAddress _length) -> {
            try {
                constants$135.PFNGLSHADERSOURCEPROC$MH.invokeExact((Addressable)symbol, _shader, _count, (java.lang.foreign.Addressable)_string, (java.lang.foreign.Addressable)_length);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

