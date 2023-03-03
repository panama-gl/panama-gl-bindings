// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTURESTORAGEMEM2DMULTISAMPLEEXTPROC {

    void apply(int texture, int samples, int internalFormat, int width, int height, byte fixedSampleLocations, int memory, long offset);
    static MemorySegment allocate(PFNGLTEXTURESTORAGEMEM2DMULTISAMPLEEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGEMEM2DMULTISAMPLEEXTPROC.class, fi, constants$730.PFNGLTEXTURESTORAGEMEM2DMULTISAMPLEEXTPROC$FUNC, session);
    }
    static PFNGLTEXTURESTORAGEMEM2DMULTISAMPLEEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _samples, int _internalFormat, int _width, int _height, byte _fixedSampleLocations, int _memory, long _offset) -> {
            try {
                constants$730.PFNGLTEXTURESTORAGEMEM2DMULTISAMPLEEXTPROC$MH.invokeExact((Addressable)symbol, _texture, _samples, _internalFormat, _width, _height, _fixedSampleLocations, _memory, _offset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

