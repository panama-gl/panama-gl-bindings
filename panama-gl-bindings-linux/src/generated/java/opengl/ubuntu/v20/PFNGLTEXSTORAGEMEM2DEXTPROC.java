// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXSTORAGEMEM2DEXTPROC {

    void apply(int target, int levels, int internalFormat, int width, int height, int memory, long offset);
    static MemorySegment allocate(PFNGLTEXSTORAGEMEM2DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXSTORAGEMEM2DEXTPROC.class, fi, constants$643.PFNGLTEXSTORAGEMEM2DEXTPROC$FUNC, session);
    }
    static PFNGLTEXSTORAGEMEM2DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _levels, int _internalFormat, int _width, int _height, int _memory, long _offset) -> {
            try {
                constants$643.PFNGLTEXSTORAGEMEM2DEXTPROC$MH.invokeExact((Addressable)symbol, _target, _levels, _internalFormat, _width, _height, _memory, _offset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


