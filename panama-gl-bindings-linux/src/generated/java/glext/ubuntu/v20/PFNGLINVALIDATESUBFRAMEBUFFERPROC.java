// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLINVALIDATESUBFRAMEBUFFERPROC {

    void apply(int target, int numAttachments, java.lang.foreign.MemoryAddress attachments, int x, int y, int width, int height);
    static MemorySegment allocate(PFNGLINVALIDATESUBFRAMEBUFFERPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLINVALIDATESUBFRAMEBUFFERPROC.class, fi, constants$337.PFNGLINVALIDATESUBFRAMEBUFFERPROC$FUNC, session);
    }
    static PFNGLINVALIDATESUBFRAMEBUFFERPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _numAttachments, java.lang.foreign.MemoryAddress _attachments, int _x, int _y, int _width, int _height) -> {
            try {
                constants$337.PFNGLINVALIDATESUBFRAMEBUFFERPROC$MH.invokeExact((Addressable)symbol, _target, _numAttachments, (java.lang.foreign.Addressable)_attachments, _x, _y, _width, _height);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


