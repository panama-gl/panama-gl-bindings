// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface gluQuadricCallback$CallBackFunc {

    void apply();
    static MemorySegment allocate(gluQuadricCallback$CallBackFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(gluQuadricCallback$CallBackFunc.class, fi, constants$171.gluQuadricCallback$CallBackFunc$FUNC, session);
    }
    static gluQuadricCallback$CallBackFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$171.gluQuadricCallback$CallBackFunc$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


