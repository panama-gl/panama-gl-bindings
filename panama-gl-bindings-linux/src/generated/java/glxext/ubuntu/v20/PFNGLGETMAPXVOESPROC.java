// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETMAPXVOESPROC {

    void apply(int target, int query, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLGETMAPXVOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETMAPXVOESPROC.class, fi, constants$516.PFNGLGETMAPXVOESPROC$FUNC, session);
    }
    static PFNGLGETMAPXVOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _query, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$516.PFNGLGETMAPXVOESPROC$MH.invokeExact((Addressable)symbol, _target, _query, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


