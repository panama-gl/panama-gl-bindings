// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBL2DEXTPROC {

    void apply(int index, double x, double y);
    static MemorySegment allocate(PFNGLVERTEXATTRIBL2DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBL2DEXTPROC.class, fi, constants$971.PFNGLVERTEXATTRIBL2DEXTPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBL2DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, double _x, double _y) -> {
            try {
                constants$972.PFNGLVERTEXATTRIBL2DEXTPROC$MH.invokeExact((Addressable)symbol, _index, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


