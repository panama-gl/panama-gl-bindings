// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIB4SNVPROC {

    void apply(int index, short x, short y, short z, short w);
    static MemorySegment allocate(PFNGLVERTEXATTRIB4SNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB4SNVPROC.class, fi, constants$865.PFNGLVERTEXATTRIB4SNVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIB4SNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, short _x, short _y, short _z, short _w) -> {
            try {
                constants$865.PFNGLVERTEXATTRIB4SNVPROC$MH.invokeExact((Addressable)symbol, _index, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


