// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIB4NUBPROC {

    void apply(int index, byte x, byte y, byte z, byte w);
    static MemorySegment allocate(PFNGLVERTEXATTRIB4NUBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB4NUBPROC.class, fi, constants$224.PFNGLVERTEXATTRIB4NUBPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIB4NUBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, byte _x, byte _y, byte _z, byte _w) -> {
            try {
                constants$224.PFNGLVERTEXATTRIB4NUBPROC$MH.invokeExact((Addressable)symbol, _index, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


