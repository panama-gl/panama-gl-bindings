// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM1FVPROC {

    void apply(int location, int count, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLUNIFORM1FVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM1FVPROC.class, fi, constants$128.PFNGLUNIFORM1FVPROC$FUNC, session);
    }
    static PFNGLUNIFORM1FVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, int _count, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$128.PFNGLUNIFORM1FVPROC$MH.invokeExact((Addressable)symbol, _location, _count, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


