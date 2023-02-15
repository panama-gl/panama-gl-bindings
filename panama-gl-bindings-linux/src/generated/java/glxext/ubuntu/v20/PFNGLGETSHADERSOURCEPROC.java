// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETSHADERSOURCEPROC {

    void apply(int shader, int bufSize, java.lang.foreign.MemoryAddress length, java.lang.foreign.MemoryAddress source);
    static MemorySegment allocate(PFNGLGETSHADERSOURCEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETSHADERSOURCEPROC.class, fi, constants$206.PFNGLGETSHADERSOURCEPROC$FUNC, session);
    }
    static PFNGLGETSHADERSOURCEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _shader, int _bufSize, java.lang.foreign.MemoryAddress _length, java.lang.foreign.MemoryAddress _source) -> {
            try {
                constants$206.PFNGLGETSHADERSOURCEPROC$MH.invokeExact((Addressable)symbol, _shader, _bufSize, (java.lang.foreign.Addressable)_length, (java.lang.foreign.Addressable)_source);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


