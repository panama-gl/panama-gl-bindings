// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMUNIFORM2UI64ARBPROC {

    void apply(int program, int location, long x, long y);
    static MemorySegment allocate(PFNGLPROGRAMUNIFORM2UI64ARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2UI64ARBPROC.class, fi, constants$426.PFNGLPROGRAMUNIFORM2UI64ARBPROC$FUNC, session);
    }
    static PFNGLPROGRAMUNIFORM2UI64ARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, long _x, long _y) -> {
            try {
                constants$426.PFNGLPROGRAMUNIFORM2UI64ARBPROC$MH.invokeExact((Addressable)symbol, _program, _location, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


