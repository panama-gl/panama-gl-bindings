// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC {

    void apply(int target, int attachment, int renderbuffertarget, int renderbuffer);
    static MemorySegment allocate(PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC.class, fi, constants$630.PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC$FUNC, session);
    }
    static PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _attachment, int _renderbuffertarget, int _renderbuffer) -> {
            try {
                constants$630.PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC$MH.invokeExact((Addressable)symbol, _target, _attachment, _renderbuffertarget, _renderbuffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


