// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTURESTORAGE2DMULTISAMPLEPROC {

    void apply(int texture, int samples, int internalformat, int width, int height, byte fixedsamplelocations);
    static MemorySegment allocate(PFNGLTEXTURESTORAGE2DMULTISAMPLEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGE2DMULTISAMPLEPROC.class, fi, constants$372.PFNGLTEXTURESTORAGE2DMULTISAMPLEPROC$FUNC, session);
    }
    static PFNGLTEXTURESTORAGE2DMULTISAMPLEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _samples, int _internalformat, int _width, int _height, byte _fixedsamplelocations) -> {
            try {
                constants$372.PFNGLTEXTURESTORAGE2DMULTISAMPLEPROC$MH.invokeExact((Addressable)symbol, _texture, _samples, _internalformat, _width, _height, _fixedsamplelocations);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


