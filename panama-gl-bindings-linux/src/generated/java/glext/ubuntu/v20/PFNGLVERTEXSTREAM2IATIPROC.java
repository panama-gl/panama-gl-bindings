// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXSTREAM2IATIPROC {

    void apply(int stream, int x, int y);
    static MemorySegment allocate(PFNGLVERTEXSTREAM2IATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM2IATIPROC.class, fi, constants$504.PFNGLVERTEXSTREAM2IATIPROC$FUNC, session);
    }
    static PFNGLVERTEXSTREAM2IATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _stream, int _x, int _y) -> {
            try {
                constants$504.PFNGLVERTEXSTREAM2IATIPROC$MH.invokeExact((Addressable)symbol, _stream, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


