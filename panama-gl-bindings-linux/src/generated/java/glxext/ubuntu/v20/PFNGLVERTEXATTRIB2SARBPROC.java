// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIB2SARBPROC {

    void apply(int index, short x, short y);
    static MemorySegment allocate(PFNGLVERTEXATTRIB2SARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB2SARBPROC.class, fi, constants$473.PFNGLVERTEXATTRIB2SARBPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIB2SARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, short _x, short _y) -> {
            try {
                constants$473.PFNGLVERTEXATTRIB2SARBPROC$MH.invokeExact((Addressable)symbol, _index, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


