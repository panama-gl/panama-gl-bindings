// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTURESTORAGE1DPROC {

    void apply(int texture, int levels, int internalformat, int width);
    static MemorySegment allocate(PFNGLTEXTURESTORAGE1DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGE1DPROC.class, fi, constants$375.PFNGLTEXTURESTORAGE1DPROC$FUNC, session);
    }
    static PFNGLTEXTURESTORAGE1DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _levels, int _internalformat, int _width) -> {
            try {
                constants$375.PFNGLTEXTURESTORAGE1DPROC$MH.invokeExact((Addressable)symbol, _texture, _levels, _internalformat, _width);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


