// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSECONDARYCOLOR3SEXTPROC {

    void apply(short red, short green, short blue);
    static MemorySegment allocate(PFNGLSECONDARYCOLOR3SEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3SEXTPROC.class, fi, constants$657.PFNGLSECONDARYCOLOR3SEXTPROC$FUNC, session);
    }
    static PFNGLSECONDARYCOLOR3SEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (short _red, short _green, short _blue) -> {
            try {
                constants$657.PFNGLSECONDARYCOLOR3SEXTPROC$MH.invokeExact((Addressable)symbol, _red, _green, _blue);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


