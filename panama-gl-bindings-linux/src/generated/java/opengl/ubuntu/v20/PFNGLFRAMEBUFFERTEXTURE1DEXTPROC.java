// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFRAMEBUFFERTEXTURE1DEXTPROC {

    void apply(int target, int attachment, int textarget, int texture, int level);
    static MemorySegment allocate(PFNGLFRAMEBUFFERTEXTURE1DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERTEXTURE1DEXTPROC.class, fi, constants$629.PFNGLFRAMEBUFFERTEXTURE1DEXTPROC$FUNC, session);
    }
    static PFNGLFRAMEBUFFERTEXTURE1DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _attachment, int _textarget, int _texture, int _level) -> {
            try {
                constants$629.PFNGLFRAMEBUFFERTEXTURE1DEXTPROC$MH.invokeExact((Addressable)symbol, _target, _attachment, _textarget, _texture, _level);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


