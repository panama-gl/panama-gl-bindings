// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSECONDARYCOLOR3BPROC {

    void apply(byte red, byte green, byte blue);
    static MemorySegment allocate(PFNGLSECONDARYCOLOR3BPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3BPROC.class, fi, constants$95.PFNGLSECONDARYCOLOR3BPROC$FUNC, session);
    }
    static PFNGLSECONDARYCOLOR3BPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (byte _red, byte _green, byte _blue) -> {
            try {
                constants$95.PFNGLSECONDARYCOLOR3BPROC$MH.invokeExact((Addressable)symbol, _red, _green, _blue);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


