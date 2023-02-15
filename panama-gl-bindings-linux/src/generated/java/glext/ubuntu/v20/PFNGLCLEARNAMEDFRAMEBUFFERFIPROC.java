// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCLEARNAMEDFRAMEBUFFERFIPROC {

    void apply(int framebuffer, int buffer, int drawbuffer, float depth, int stencil);
    static MemorySegment allocate(PFNGLCLEARNAMEDFRAMEBUFFERFIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCLEARNAMEDFRAMEBUFFERFIPROC.class, fi, constants$282.PFNGLCLEARNAMEDFRAMEBUFFERFIPROC$FUNC, session);
    }
    static PFNGLCLEARNAMEDFRAMEBUFFERFIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _framebuffer, int _buffer, int _drawbuffer, float _depth, int _stencil) -> {
            try {
                constants$282.PFNGLCLEARNAMEDFRAMEBUFFERFIPROC$MH.invokeExact((Addressable)symbol, _framebuffer, _buffer, _drawbuffer, _depth, _stencil);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


