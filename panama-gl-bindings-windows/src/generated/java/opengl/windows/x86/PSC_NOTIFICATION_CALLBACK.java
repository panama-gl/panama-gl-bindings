// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PSC_NOTIFICATION_CALLBACK {

    void apply(int _x0, java.lang.foreign.MemoryAddress _x1);
    static MemorySegment allocate(PSC_NOTIFICATION_CALLBACK fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PSC_NOTIFICATION_CALLBACK.class, fi, constants$626.PSC_NOTIFICATION_CALLBACK$FUNC, session);
    }
    static PSC_NOTIFICATION_CALLBACK ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0, java.lang.foreign.MemoryAddress __x1) -> {
            try {
                constants$626.PSC_NOTIFICATION_CALLBACK$MH.invokeExact((Addressable)symbol, __x0, (java.lang.foreign.Addressable)__x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


