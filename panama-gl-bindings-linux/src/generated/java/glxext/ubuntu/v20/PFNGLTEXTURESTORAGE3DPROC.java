// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTURESTORAGE3DPROC {

    void apply(int texture, int levels, int internalformat, int width, int height, int depth);
    static MemorySegment allocate(PFNGLTEXTURESTORAGE3DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGE3DPROC.class, fi, constants$372.PFNGLTEXTURESTORAGE3DPROC$FUNC, session);
    }
    static PFNGLTEXTURESTORAGE3DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _levels, int _internalformat, int _width, int _height, int _depth) -> {
            try {
                constants$372.PFNGLTEXTURESTORAGE3DPROC$MH.invokeExact((Addressable)symbol, _texture, _levels, _internalformat, _width, _height, _depth);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


