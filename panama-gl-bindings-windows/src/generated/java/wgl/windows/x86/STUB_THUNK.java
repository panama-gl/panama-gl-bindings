// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface STUB_THUNK {

    void apply(java.lang.foreign.MemoryAddress _x0);
    static MemorySegment allocate(STUB_THUNK fi, MemorySession session) {
        return RuntimeHelper.upcallStub(STUB_THUNK.class, fi, constants$829.STUB_THUNK$FUNC, session);
    }
    static STUB_THUNK ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0) -> {
            try {
                constants$829.STUB_THUNK$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


