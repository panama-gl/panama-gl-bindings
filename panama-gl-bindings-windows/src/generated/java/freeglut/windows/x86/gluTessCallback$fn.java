// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface gluTessCallback$fn {

    void apply();
    static MemorySegment allocate(gluTessCallback$fn fi, MemorySession session) {
        return RuntimeHelper.upcallStub(gluTessCallback$fn.class, fi, constants$706.gluTessCallback$fn$FUNC, session);
    }
    static gluTessCallback$fn ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$707.gluTessCallback$fn$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


