// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXSUBIMAGE1DEXTPROC {

    void apply(int target, int level, int xoffset, int width, int format, int type, java.lang.foreign.MemoryAddress pixels);
    static MemorySegment allocate(PFNGLTEXSUBIMAGE1DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXSUBIMAGE1DEXTPROC.class, fi, constants$953.PFNGLTEXSUBIMAGE1DEXTPROC$FUNC, session);
    }
    static PFNGLTEXSUBIMAGE1DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _level, int _xoffset, int _width, int _format, int _type, java.lang.foreign.MemoryAddress _pixels) -> {
            try {
                constants$953.PFNGLTEXSUBIMAGE1DEXTPROC$MH.invokeExact((Addressable)symbol, _target, _level, _xoffset, _width, _format, _type, (java.lang.foreign.Addressable)_pixels);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

