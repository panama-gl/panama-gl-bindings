// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PTERMINATION_HANDLER {

    void apply(byte _abnormal_termination, java.lang.foreign.MemoryAddress EstablisherFrame);
    static MemorySegment allocate(PTERMINATION_HANDLER fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PTERMINATION_HANDLER.class, fi, constants$63.PTERMINATION_HANDLER$FUNC, session);
    }
    static PTERMINATION_HANDLER ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (byte __abnormal_termination, java.lang.foreign.MemoryAddress _EstablisherFrame) -> {
            try {
                constants$64.PTERMINATION_HANDLER$MH.invokeExact((Addressable)symbol, __abnormal_termination, (java.lang.foreign.Addressable)_EstablisherFrame);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


