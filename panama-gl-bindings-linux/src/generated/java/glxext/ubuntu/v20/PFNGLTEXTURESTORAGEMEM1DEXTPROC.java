// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTURESTORAGEMEM1DEXTPROC {

    void apply(int texture, int levels, int internalFormat, int width, int memory, long offset);
    static MemorySegment allocate(PFNGLTEXTURESTORAGEMEM1DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGEMEM1DEXTPROC.class, fi, constants$732.PFNGLTEXTURESTORAGEMEM1DEXTPROC$FUNC, session);
    }
    static PFNGLTEXTURESTORAGEMEM1DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _levels, int _internalFormat, int _width, int _memory, long _offset) -> {
            try {
                constants$732.PFNGLTEXTURESTORAGEMEM1DEXTPROC$MH.invokeExact((Addressable)symbol, _texture, _levels, _internalFormat, _width, _memory, _offset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


