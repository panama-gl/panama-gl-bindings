// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORMMATRIX2X4FVPROC {

    void apply(int location, int count, byte transpose, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLUNIFORMMATRIX2X4FVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORMMATRIX2X4FVPROC.class, fi, constants$145.PFNGLUNIFORMMATRIX2X4FVPROC$FUNC, session);
    }
    static PFNGLUNIFORMMATRIX2X4FVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, int _count, byte _transpose, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$145.PFNGLUNIFORMMATRIX2X4FVPROC$MH.invokeExact((Addressable)symbol, _location, _count, _transpose, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


