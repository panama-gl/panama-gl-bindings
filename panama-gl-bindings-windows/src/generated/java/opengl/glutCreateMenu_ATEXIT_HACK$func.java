// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutCreateMenu_ATEXIT_HACK$func {

    void apply(int _x0);
    static MemorySegment allocate(glutCreateMenu_ATEXIT_HACK$func fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutCreateMenu_ATEXIT_HACK$func.class, fi, constants$784.glutCreateMenu_ATEXIT_HACK$func$FUNC, session);
    }
    static glutCreateMenu_ATEXIT_HACK$func ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0) -> {
            try {
                constants$785.glutCreateMenu_ATEXIT_HACK$func$MH.invokeExact((Addressable)symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


