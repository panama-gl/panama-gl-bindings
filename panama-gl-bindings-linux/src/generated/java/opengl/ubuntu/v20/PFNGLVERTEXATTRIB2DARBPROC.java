// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIB2DARBPROC {

    void apply(int index, double x, double y);
    static MemorySegment allocate(PFNGLVERTEXATTRIB2DARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB2DARBPROC.class, fi, constants$387.PFNGLVERTEXATTRIB2DARBPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIB2DARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, double _x, double _y) -> {
            try {
                constants$387.PFNGLVERTEXATTRIB2DARBPROC$MH.invokeExact((Addressable)symbol, _index, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


