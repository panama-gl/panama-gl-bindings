// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXSTREAM1DATIPROC {

    void apply(int stream, double x);
    static MemorySegment allocate(PFNGLVERTEXSTREAM1DATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM1DATIPROC.class, fi, constants$588.PFNGLVERTEXSTREAM1DATIPROC$FUNC, session);
    }
    static PFNGLVERTEXSTREAM1DATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _stream, double _x) -> {
            try {
                constants$588.PFNGLVERTEXSTREAM1DATIPROC$MH.invokeExact((Addressable)symbol, _stream, _x);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


