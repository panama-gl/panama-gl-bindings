// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSECONDARYCOLOR3USEXTPROC {

    void apply(short red, short green, short blue);
    static MemorySegment allocate(PFNGLSECONDARYCOLOR3USEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3USEXTPROC.class, fi, constants$940.PFNGLSECONDARYCOLOR3USEXTPROC$FUNC, session);
    }
    static PFNGLSECONDARYCOLOR3USEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (short _red, short _green, short _blue) -> {
            try {
                constants$940.PFNGLSECONDARYCOLOR3USEXTPROC$MH.invokeExact((Addressable)symbol, _red, _green, _blue);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


