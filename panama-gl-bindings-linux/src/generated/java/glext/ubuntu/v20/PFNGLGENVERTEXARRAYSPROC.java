// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGENVERTEXARRAYSPROC {

    void apply(int n, java.lang.foreign.MemoryAddress arrays);
    static MemorySegment allocate(PFNGLGENVERTEXARRAYSPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGENVERTEXARRAYSPROC.class, fi, constants$173.PFNGLGENVERTEXARRAYSPROC$FUNC, session);
    }
    static PFNGLGENVERTEXARRAYSPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, java.lang.foreign.MemoryAddress _arrays) -> {
            try {
                constants$173.PFNGLGENVERTEXARRAYSPROC$MH.invokeExact((Addressable)symbol, _n, (java.lang.foreign.Addressable)_arrays);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


