// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC {

    void apply(int framebuffer, int buffer, int drawbuffer, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC.class, fi, constants$366.PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC$FUNC, session);
    }
    static PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _framebuffer, int _buffer, int _drawbuffer, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$366.PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC$MH.invokeExact((Addressable)symbol, _framebuffer, _buffer, _drawbuffer, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


