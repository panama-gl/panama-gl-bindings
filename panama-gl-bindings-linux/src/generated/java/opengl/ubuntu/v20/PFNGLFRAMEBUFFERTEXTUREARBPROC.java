// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFRAMEBUFFERTEXTUREARBPROC {

    void apply(int target, int attachment, int texture, int level);
    static MemorySegment allocate(PFNGLFRAMEBUFFERTEXTUREARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERTEXTUREARBPROC.class, fi, constants$329.PFNGLFRAMEBUFFERTEXTUREARBPROC$FUNC, session);
    }
    static PFNGLFRAMEBUFFERTEXTUREARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _attachment, int _texture, int _level) -> {
            try {
                constants$329.PFNGLFRAMEBUFFERTEXTUREARBPROC$MH.invokeExact((Addressable)symbol, _target, _attachment, _texture, _level);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


