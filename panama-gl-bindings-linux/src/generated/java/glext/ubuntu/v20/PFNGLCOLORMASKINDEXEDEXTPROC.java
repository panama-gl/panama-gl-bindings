// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOLORMASKINDEXEDEXTPROC {

    void apply(int index, byte r, byte g, byte b, byte a);
    static MemorySegment allocate(PFNGLCOLORMASKINDEXEDEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOLORMASKINDEXEDEXTPROC.class, fi, constants$621.PFNGLCOLORMASKINDEXEDEXTPROC$FUNC, session);
    }
    static PFNGLCOLORMASKINDEXEDEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, byte _r, byte _g, byte _b, byte _a) -> {
            try {
                constants$621.PFNGLCOLORMASKINDEXEDEXTPROC$MH.invokeExact((Addressable)symbol, _index, _r, _g, _b, _a);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


