// Generated by jextract

package opengl.macos.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutEntryFunc$func {

    void apply(int _x0);
    static MemorySegment allocate(glutEntryFunc$func fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutEntryFunc$func.class, fi, constants$187.glutEntryFunc$func$FUNC, session);
    }
    static glutEntryFunc$func ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0) -> {
            try {
                constants$188.glutEntryFunc$func$MH.invokeExact((Addressable)symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

