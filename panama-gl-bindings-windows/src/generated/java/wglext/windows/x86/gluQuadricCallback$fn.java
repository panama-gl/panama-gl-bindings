// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface gluQuadricCallback$fn {

    void apply();
    static MemorySegment allocate(gluQuadricCallback$fn fi, MemorySession session) {
        return RuntimeHelper.upcallStub(gluQuadricCallback$fn.class, fi, constants$1357.gluQuadricCallback$fn$FUNC, session);
    }
    static gluQuadricCallback$fn ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$1357.gluQuadricCallback$fn$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


