// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC {

    void apply(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer);
    static MemorySegment allocate(PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC.class, fi, constants$818.PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC$FUNC, session);
    }
    static PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _framebuffer, int _attachment, int _renderbuffertarget, int _renderbuffer) -> {
            try {
                constants$818.PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC$MH.invokeExact((Addressable)symbol, _framebuffer, _attachment, _renderbuffertarget, _renderbuffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


