// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutWMCloseFunc$func {

    void apply();
    static MemorySegment allocate(glutWMCloseFunc$func fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutWMCloseFunc$func.class, fi, constants$180.glutWMCloseFunc$func$FUNC, session);
    }
    static glutWMCloseFunc$func ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$181.glutWMCloseFunc$func$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

