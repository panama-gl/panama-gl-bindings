// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNAMEDFRAMEBUFFERTEXTUREPROC {

    void apply(int framebuffer, int attachment, int texture, int level);
    static MemorySegment allocate(PFNGLNAMEDFRAMEBUFFERTEXTUREPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERTEXTUREPROC.class, fi, constants$364.PFNGLNAMEDFRAMEBUFFERTEXTUREPROC$FUNC, session);
    }
    static PFNGLNAMEDFRAMEBUFFERTEXTUREPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _framebuffer, int _attachment, int _texture, int _level) -> {
            try {
                constants$364.PFNGLNAMEDFRAMEBUFFERTEXTUREPROC$MH.invokeExact((Addressable)symbol, _framebuffer, _attachment, _texture, _level);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


