// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBI4IPROC {

    void apply(int index, int x, int y, int z, int w);
    static MemorySegment allocate(PFNGLVERTEXATTRIBI4IPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI4IPROC.class, fi, constants$238.PFNGLVERTEXATTRIBI4IPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBI4IPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _x, int _y, int _z, int _w) -> {
            try {
                constants$238.PFNGLVERTEXATTRIBI4IPROC$MH.invokeExact((Addressable)symbol, _index, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


