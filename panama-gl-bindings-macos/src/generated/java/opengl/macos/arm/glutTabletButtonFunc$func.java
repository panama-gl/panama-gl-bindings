// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutTabletButtonFunc$func {

    void apply(int _x0, int _x1, int _x2, int _x3);
    static MemorySegment allocate(glutTabletButtonFunc$func fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutTabletButtonFunc$func.class, fi, constants$193.glutTabletButtonFunc$func$FUNC, session);
    }
    static glutTabletButtonFunc$func ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0, int __x1, int __x2, int __x3) -> {
            try {
                constants$194.glutTabletButtonFunc$func$MH.invokeExact((Addressable)symbol, __x0, __x1, __x2, __x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

