// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTURESTORAGE1DEXTPROC {

    void apply(int texture, int target, int levels, int internalformat, int width);
    static MemorySegment allocate(PFNGLTEXTURESTORAGE1DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGE1DEXTPROC.class, fi, constants$616.PFNGLTEXTURESTORAGE1DEXTPROC$FUNC, session);
    }
    static PFNGLTEXTURESTORAGE1DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _target, int _levels, int _internalformat, int _width) -> {
            try {
                constants$616.PFNGLTEXTURESTORAGE1DEXTPROC$MH.invokeExact((Addressable)symbol, _texture, _target, _levels, _internalformat, _width);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


