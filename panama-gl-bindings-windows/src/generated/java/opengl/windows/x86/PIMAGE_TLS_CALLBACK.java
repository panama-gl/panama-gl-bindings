// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PIMAGE_TLS_CALLBACK {

    void apply(java.lang.foreign.MemoryAddress DllHandle, int Reason, java.lang.foreign.MemoryAddress Reserved);
    static MemorySegment allocate(PIMAGE_TLS_CALLBACK fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PIMAGE_TLS_CALLBACK.class, fi, constants$112.PIMAGE_TLS_CALLBACK$FUNC, session);
    }
    static PIMAGE_TLS_CALLBACK ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _DllHandle, int _Reason, java.lang.foreign.MemoryAddress _Reserved) -> {
            try {
                constants$112.PIMAGE_TLS_CALLBACK$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_DllHandle, _Reason, (java.lang.foreign.Addressable)_Reserved);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


