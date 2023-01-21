// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC {

    void apply(int framebuffer, int attachment, int texture, int level, int layer);
    static MemorySegment allocate(PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC.class, fi, constants$685.PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC$FUNC, session);
    }
    static PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _framebuffer, int _attachment, int _texture, int _level, int _layer) -> {
            try {
                constants$685.PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC$MH.invokeExact((Addressable)symbol, _framebuffer, _attachment, _texture, _level, _layer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


