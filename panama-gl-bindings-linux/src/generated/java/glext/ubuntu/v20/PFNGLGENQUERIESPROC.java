// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGENQUERIESPROC {

    void apply(int n, java.lang.foreign.MemoryAddress ids);
    static MemorySegment allocate(PFNGLGENQUERIESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGENQUERIESPROC.class, fi, constants$114.PFNGLGENQUERIESPROC$FUNC, session);
    }
    static PFNGLGENQUERIESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, java.lang.foreign.MemoryAddress _ids) -> {
            try {
                constants$114.PFNGLGENQUERIESPROC$MH.invokeExact((Addressable)symbol, _n, (java.lang.foreign.Addressable)_ids);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


