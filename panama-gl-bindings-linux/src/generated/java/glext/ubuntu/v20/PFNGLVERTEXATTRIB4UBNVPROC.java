// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIB4UBNVPROC {

    void apply(int index, byte x, byte y, byte z, byte w);
    static MemorySegment allocate(PFNGLVERTEXATTRIB4UBNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB4UBNVPROC.class, fi, constants$1244.PFNGLVERTEXATTRIB4UBNVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIB4UBNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, byte _x, byte _y, byte _z, byte _w) -> {
            try {
                constants$1244.PFNGLVERTEXATTRIB4UBNVPROC$MH.invokeExact((Addressable)symbol, _index, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


