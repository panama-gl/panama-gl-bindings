// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM4I64ARBPROC {

    void apply(int program, int location, long x, long y, long z, long w);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM4I64ARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM4I64ARBPROC.class, fi, constants$424.PFNGLPROGRAMUNIFORM4I64ARBPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM4I64ARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, long _x, long _y, long _z, long _w) -> {
            try {
                constants$424.PFNGLPROGRAMUNIFORM4I64ARBPROC$MH.invokeExact((Addressable)symbol, _program, _location, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

