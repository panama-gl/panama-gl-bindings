// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXSTORAGEMEM1DEXTPROC {

    void apply(int target, int levels, int internalFormat, int width, int memory, long offset);
    static MemorySegment allocate(PFNGLTEXSTORAGEMEM1DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXSTORAGEMEM1DEXTPROC.class, fi, constants$646.PFNGLTEXSTORAGEMEM1DEXTPROC$FUNC, session);
    }
    static PFNGLTEXSTORAGEMEM1DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _levels, int _internalFormat, int _width, int _memory, long _offset) -> {
            try {
                constants$646.PFNGLTEXSTORAGEMEM1DEXTPROC$MH.invokeExact((Addressable)symbol, _target, _levels, _internalFormat, _width, _memory, _offset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


