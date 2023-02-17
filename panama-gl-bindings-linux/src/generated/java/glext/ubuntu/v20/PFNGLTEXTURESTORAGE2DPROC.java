// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTURESTORAGE2DPROC {

    void apply(int texture, int levels, int internalformat, int width, int height);
    static MemorySegment allocate(PFNGLTEXTURESTORAGE2DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGE2DPROC.class, fi, constants$375.PFNGLTEXTURESTORAGE2DPROC$FUNC, session);
    }
    static PFNGLTEXTURESTORAGE2DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _levels, int _internalformat, int _width, int _height) -> {
            try {
                constants$375.PFNGLTEXTURESTORAGE2DPROC$MH.invokeExact((Addressable)symbol, _texture, _levels, _internalformat, _width, _height);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


