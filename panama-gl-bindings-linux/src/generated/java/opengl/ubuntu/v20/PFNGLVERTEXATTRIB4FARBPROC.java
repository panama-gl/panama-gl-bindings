// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIB4FARBPROC {

    void apply(int index, float x, float y, float z, float w);
    static MemorySegment allocate(PFNGLVERTEXATTRIB4FARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB4FARBPROC.class, fi, constants$394.PFNGLVERTEXATTRIB4FARBPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIB4FARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, float _x, float _y, float _z, float _w) -> {
            try {
                constants$394.PFNGLVERTEXATTRIB4FARBPROC$MH.invokeExact((Addressable)symbol, _index, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


