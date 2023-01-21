// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTURERENDERBUFFEREXTPROC {

    void apply(int texture, int target, int renderbuffer);
    static MemorySegment allocate(PFNGLTEXTURERENDERBUFFEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURERENDERBUFFEREXTPROC.class, fi, constants$686.PFNGLTEXTURERENDERBUFFEREXTPROC$FUNC, session);
    }
    static PFNGLTEXTURERENDERBUFFEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _target, int _renderbuffer) -> {
            try {
                constants$686.PFNGLTEXTURERENDERBUFFEREXTPROC$MH.invokeExact((Addressable)symbol, _texture, _target, _renderbuffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

