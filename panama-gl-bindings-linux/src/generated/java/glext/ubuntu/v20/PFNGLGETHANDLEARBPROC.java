// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETHANDLEARBPROC {

    int apply(int pname);
    static MemorySegment allocate(PFNGLGETHANDLEARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETHANDLEARBPROC.class, fi, constants$490.PFNGLGETHANDLEARBPROC$FUNC, session);
    }
    static PFNGLGETHANDLEARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pname) -> {
            try {
                return (int)constants$490.PFNGLGETHANDLEARBPROC$MH.invokeExact((Addressable)symbol, _pname);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


