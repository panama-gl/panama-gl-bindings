// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutOverlayDisplayFunc$callback {

    void apply();
    static MemorySegment allocate(glutOverlayDisplayFunc$callback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutOverlayDisplayFunc$callback.class, fi, constants$731.glutOverlayDisplayFunc$callback$FUNC, session);
    }
    static glutOverlayDisplayFunc$callback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$731.glutOverlayDisplayFunc$callback$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


