// Generated by jextract

package opengl.macos.v10_15_7;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface glutKeyboardUpFunc$func {

    void apply(byte _x0, int _x1, int _x2);
    static MemorySegment allocate(glutKeyboardUpFunc$func fi, MemorySession session) {
        return RuntimeHelper.upcallStub(glutKeyboardUpFunc$func.class, fi, constants$195.glutKeyboardUpFunc$func$FUNC, session);
    }
    static glutKeyboardUpFunc$func ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (byte __x0, int __x1, int __x2) -> {
            try {
                constants$196.glutKeyboardUpFunc$func$MH.invokeExact((Addressable)symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


