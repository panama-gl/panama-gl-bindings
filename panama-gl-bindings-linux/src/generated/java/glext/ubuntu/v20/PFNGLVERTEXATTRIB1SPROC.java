// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIB1SPROC {

    void apply(int index, short x);
    static MemorySegment allocate(PFNGLVERTEXATTRIB1SPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB1SPROC.class, fi, constants$144.PFNGLVERTEXATTRIB1SPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIB1SPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, short _x) -> {
            try {
                constants$144.PFNGLVERTEXATTRIB1SPROC$MH.invokeExact((Addressable)symbol, _index, _x);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


