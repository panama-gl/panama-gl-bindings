// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFRAMEBUFFERTEXTURE3DEXTPROC {

    void apply(int target, int attachment, int textarget, int texture, int level, int zoffset);
    static MemorySegment allocate(PFNGLFRAMEBUFFERTEXTURE3DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERTEXTURE3DEXTPROC.class, fi, constants$715.PFNGLFRAMEBUFFERTEXTURE3DEXTPROC$FUNC, session);
    }
    static PFNGLFRAMEBUFFERTEXTURE3DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _attachment, int _textarget, int _texture, int _level, int _zoffset) -> {
            try {
                constants$715.PFNGLFRAMEBUFFERTEXTURE3DEXTPROC$MH.invokeExact((Addressable)symbol, _target, _attachment, _textarget, _texture, _level, _zoffset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


