// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLACTIVETEXTUREARBPROC {

    void apply(int texture);
    static MemorySegment allocate(PFNGLACTIVETEXTUREARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLACTIVETEXTUREARBPROC.class, fi, constants$165.PFNGLACTIVETEXTUREARBPROC$FUNC, session);
    }
    static PFNGLACTIVETEXTUREARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture) -> {
            try {
                constants$165.PFNGLACTIVETEXTUREARBPROC$MH.invokeExact((Addressable)symbol, _texture);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


