// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIB4NUBARBPROC {

    void apply(int index, byte x, byte y, byte z, byte w);
    static MemorySegment allocate(PFNGLVERTEXATTRIB4NUBARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB4NUBARBPROC.class, fi, constants$477.PFNGLVERTEXATTRIB4NUBARBPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIB4NUBARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, byte _x, byte _y, byte _z, byte _w) -> {
            try {
                constants$477.PFNGLVERTEXATTRIB4NUBARBPROC$MH.invokeExact((Addressable)symbol, _index, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


