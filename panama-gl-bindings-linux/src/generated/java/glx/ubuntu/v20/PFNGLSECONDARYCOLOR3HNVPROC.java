// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSECONDARYCOLOR3HNVPROC {

    void apply(short red, short green, short blue);
    static MemorySegment allocate(PFNGLSECONDARYCOLOR3HNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3HNVPROC.class, fi, constants$859.PFNGLSECONDARYCOLOR3HNVPROC$FUNC, session);
    }
    static PFNGLSECONDARYCOLOR3HNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (short _red, short _green, short _blue) -> {
            try {
                constants$859.PFNGLSECONDARYCOLOR3HNVPROC$MH.invokeExact((Addressable)symbol, _red, _green, _blue);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

