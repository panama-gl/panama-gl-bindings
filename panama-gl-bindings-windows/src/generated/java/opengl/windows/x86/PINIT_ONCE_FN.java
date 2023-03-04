// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PINIT_ONCE_FN {

    int apply(java.lang.foreign.MemoryAddress InitOnce, java.lang.foreign.MemoryAddress Parameter, java.lang.foreign.MemoryAddress Context);
    static MemorySegment allocate(PINIT_ONCE_FN fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PINIT_ONCE_FN.class, fi, constants$171.PINIT_ONCE_FN$FUNC, session);
    }
    static PINIT_ONCE_FN ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _InitOnce, java.lang.foreign.MemoryAddress _Parameter, java.lang.foreign.MemoryAddress _Context) -> {
            try {
                return (int)constants$171.PINIT_ONCE_FN$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_InitOnce, (java.lang.foreign.Addressable)_Parameter, (java.lang.foreign.Addressable)_Context);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


