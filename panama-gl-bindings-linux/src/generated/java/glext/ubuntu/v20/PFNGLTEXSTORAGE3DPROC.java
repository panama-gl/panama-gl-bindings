// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXSTORAGE3DPROC {

    void apply(int target, int levels, int internalformat, int width, int height, int depth);
    static MemorySegment allocate(PFNGLTEXSTORAGE3DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXSTORAGE3DPROC.class, fi, constants$330.PFNGLTEXSTORAGE3DPROC$FUNC, session);
    }
    static PFNGLTEXSTORAGE3DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _levels, int _internalformat, int _width, int _height, int _depth) -> {
            try {
                constants$330.PFNGLTEXSTORAGE3DPROC$MH.invokeExact((Addressable)symbol, _target, _levels, _internalformat, _width, _height, _depth);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


