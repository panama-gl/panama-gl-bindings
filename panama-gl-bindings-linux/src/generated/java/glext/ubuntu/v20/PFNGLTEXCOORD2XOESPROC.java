// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXCOORD2XOESPROC {

    void apply(int s, int t);
    static MemorySegment allocate(PFNGLTEXCOORD2XOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD2XOESPROC.class, fi, constants$603.PFNGLTEXCOORD2XOESPROC$FUNC, session);
    }
    static PFNGLTEXCOORD2XOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _s, int _t) -> {
            try {
                constants$604.PFNGLTEXCOORD2XOESPROC$MH.invokeExact((Addressable)symbol, _s, _t);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


