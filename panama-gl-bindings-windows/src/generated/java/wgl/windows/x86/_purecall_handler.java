// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface _purecall_handler {

    void apply();
    static MemorySegment allocate(_purecall_handler fi, MemorySession session) {
        return RuntimeHelper.upcallStub(_purecall_handler.class, fi, constants$936._purecall_handler$FUNC, session);
    }
    static _purecall_handler ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$936._purecall_handler$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


