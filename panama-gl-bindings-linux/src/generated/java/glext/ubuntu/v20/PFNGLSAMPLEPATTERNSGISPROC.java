// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSAMPLEPATTERNSGISPROC {

    void apply(int pattern);
    static MemorySegment allocate(PFNGLSAMPLEPATTERNSGISPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSAMPLEPATTERNSGISPROC.class, fi, constants$885.PFNGLSAMPLEPATTERNSGISPROC$FUNC, session);
    }
    static PFNGLSAMPLEPATTERNSGISPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pattern) -> {
            try {
                constants$885.PFNGLSAMPLEPATTERNSGISPROC$MH.invokeExact((Addressable)symbol, _pattern);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


