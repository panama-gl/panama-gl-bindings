// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutWindowStatusFunc$func {

    void apply(int _x0);
    static MemorySegment allocate(glutWindowStatusFunc$func fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutWindowStatusFunc$func.class, fi, constants$195.glutWindowStatusFunc$func$FUNC, session);
    }
    static glutWindowStatusFunc$func ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0) -> {
            try {
                constants$195.glutWindowStatusFunc$func$MH.invokeExact((Addressable)symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


