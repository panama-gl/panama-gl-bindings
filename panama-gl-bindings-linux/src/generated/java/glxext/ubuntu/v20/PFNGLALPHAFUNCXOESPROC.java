// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLALPHAFUNCXOESPROC {

    void apply(int func, int ref);
    static MemorySegment allocate(PFNGLALPHAFUNCXOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLALPHAFUNCXOESPROC.class, fi, constants$499.PFNGLALPHAFUNCXOESPROC$FUNC, session);
    }
    static PFNGLALPHAFUNCXOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _func, int _ref) -> {
            try {
                constants$499.PFNGLALPHAFUNCXOESPROC$MH.invokeExact((Addressable)symbol, _func, _ref);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

