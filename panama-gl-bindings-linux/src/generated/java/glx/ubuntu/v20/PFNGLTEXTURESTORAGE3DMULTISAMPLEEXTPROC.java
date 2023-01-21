// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC {

    void apply(int texture, int target, int samples, int internalformat, int width, int height, int depth, byte fixedsamplelocations);
    static MemorySegment allocate(PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC.class, fi, constants$703.PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC$FUNC, session);
    }
    static PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _target, int _samples, int _internalformat, int _width, int _height, int _depth, byte _fixedsamplelocations) -> {
            try {
                constants$703.PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC$MH.invokeExact((Addressable)symbol, _texture, _target, _samples, _internalformat, _width, _height, _depth, _fixedsamplelocations);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


