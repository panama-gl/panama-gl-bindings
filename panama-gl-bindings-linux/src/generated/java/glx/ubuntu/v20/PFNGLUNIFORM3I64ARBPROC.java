// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM3I64ARBPROC {

    void apply(int location, long x, long y, long z);
    static MemorySegment allocate(PFNGLUNIFORM3I64ARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM3I64ARBPROC.class, fi, constants$417.PFNGLUNIFORM3I64ARBPROC$FUNC, session);
    }
    static PFNGLUNIFORM3I64ARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, long _x, long _y, long _z) -> {
            try {
                constants$417.PFNGLUNIFORM3I64ARBPROC$MH.invokeExact((Addressable)symbol, _location, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


