// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORMMATRIX4DVPROC {

    void apply(int location, int count, byte transpose, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLUNIFORMMATRIX4DVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORMMATRIX4DVPROC.class, fi, constants$265.PFNGLUNIFORMMATRIX4DVPROC$FUNC, session);
    }
    static PFNGLUNIFORMMATRIX4DVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, int _count, byte _transpose, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$265.PFNGLUNIFORMMATRIX4DVPROC$MH.invokeExact((Addressable)symbol, _location, _count, _transpose, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


