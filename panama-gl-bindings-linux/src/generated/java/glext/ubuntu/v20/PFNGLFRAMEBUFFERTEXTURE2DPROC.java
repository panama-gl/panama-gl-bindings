// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFRAMEBUFFERTEXTURE2DPROC {

    void apply(int target, int attachment, int textarget, int texture, int level);
    static MemorySegment allocate(PFNGLFRAMEBUFFERTEXTURE2DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERTEXTURE2DPROC.class, fi, constants$169.PFNGLFRAMEBUFFERTEXTURE2DPROC$FUNC, session);
    }
    static PFNGLFRAMEBUFFERTEXTURE2DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _attachment, int _textarget, int _texture, int _level) -> {
            try {
                constants$169.PFNGLFRAMEBUFFERTEXTURE2DPROC$MH.invokeExact((Addressable)symbol, _target, _attachment, _textarget, _texture, _level);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


