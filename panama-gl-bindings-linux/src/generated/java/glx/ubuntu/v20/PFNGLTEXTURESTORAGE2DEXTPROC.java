// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTURESTORAGE2DEXTPROC {

    void apply(int texture, int target, int levels, int internalformat, int width, int height);
    static MemorySegment allocate(PFNGLTEXTURESTORAGE2DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGE2DEXTPROC.class, fi, constants$702.PFNGLTEXTURESTORAGE2DEXTPROC$FUNC, session);
    }
    static PFNGLTEXTURESTORAGE2DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _target, int _levels, int _internalformat, int _width, int _height) -> {
            try {
                constants$702.PFNGLTEXTURESTORAGE2DEXTPROC$MH.invokeExact((Addressable)symbol, _texture, _target, _levels, _internalformat, _width, _height);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


