// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXSTORAGE3DMULTISAMPLEPROC {

    void apply(int target, int samples, int internalformat, int width, int height, int depth, byte fixedsamplelocations);
    static MemorySegment allocate(PFNGLTEXSTORAGE3DMULTISAMPLEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXSTORAGE3DMULTISAMPLEPROC.class, fi, constants$346.PFNGLTEXSTORAGE3DMULTISAMPLEPROC$FUNC, session);
    }
    static PFNGLTEXSTORAGE3DMULTISAMPLEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _samples, int _internalformat, int _width, int _height, int _depth, byte _fixedsamplelocations) -> {
            try {
                constants$346.PFNGLTEXSTORAGE3DMULTISAMPLEPROC$MH.invokeExact((Addressable)symbol, _target, _samples, _internalformat, _width, _height, _depth, _fixedsamplelocations);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


