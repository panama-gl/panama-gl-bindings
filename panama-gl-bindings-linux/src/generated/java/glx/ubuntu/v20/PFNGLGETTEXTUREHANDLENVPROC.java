// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETTEXTUREHANDLENVPROC {

    long apply(int texture);
    static MemorySegment allocate(PFNGLGETTEXTUREHANDLENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTUREHANDLENVPROC.class, fi, constants$812.PFNGLGETTEXTUREHANDLENVPROC$FUNC, session);
    }
    static PFNGLGETTEXTUREHANDLENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture) -> {
            try {
                return (long)constants$812.PFNGLGETTEXTUREHANDLENVPROC$MH.invokeExact((Addressable)symbol, _texture);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


