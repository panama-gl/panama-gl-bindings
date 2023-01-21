// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTURESTORAGEMEM3DMULTISAMPLEEXTPROC {

    void apply(int texture, int samples, int internalFormat, int width, int height, int depth, byte fixedSampleLocations, int memory, long offset);
    static MemorySegment allocate(PFNGLTEXTURESTORAGEMEM3DMULTISAMPLEEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGEMEM3DMULTISAMPLEEXTPROC.class, fi, constants$645.PFNGLTEXTURESTORAGEMEM3DMULTISAMPLEEXTPROC$FUNC, session);
    }
    static PFNGLTEXTURESTORAGEMEM3DMULTISAMPLEEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _samples, int _internalFormat, int _width, int _height, int _depth, byte _fixedSampleLocations, int _memory, long _offset) -> {
            try {
                constants$645.PFNGLTEXTURESTORAGEMEM3DMULTISAMPLEEXTPROC$MH.invokeExact((Addressable)symbol, _texture, _samples, _internalFormat, _width, _height, _depth, _fixedSampleLocations, _memory, _offset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


