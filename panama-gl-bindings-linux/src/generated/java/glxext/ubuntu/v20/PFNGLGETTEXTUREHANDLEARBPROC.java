// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETTEXTUREHANDLEARBPROC {

    long apply(int texture);
    static MemorySegment allocate(PFNGLGETTEXTUREHANDLEARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTUREHANDLEARBPROC.class, fi, constants$398.PFNGLGETTEXTUREHANDLEARBPROC$FUNC, session);
    }
    static PFNGLGETTEXTUREHANDLEARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture) -> {
            try {
                return (long)constants$398.PFNGLGETTEXTUREHANDLEARBPROC$MH.invokeExact((Addressable)symbol, _texture);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


