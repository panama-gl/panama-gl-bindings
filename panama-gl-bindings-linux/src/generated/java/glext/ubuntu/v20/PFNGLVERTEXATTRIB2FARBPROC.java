// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIB2FARBPROC {

    void apply(int index, float x, float y);
    static MemorySegment allocate(PFNGLVERTEXATTRIB2FARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB2FARBPROC.class, fi, constants$387.PFNGLVERTEXATTRIB2FARBPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIB2FARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, float _x, float _y) -> {
            try {
                constants$387.PFNGLVERTEXATTRIB2FARBPROC$MH.invokeExact((Addressable)symbol, _index, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


