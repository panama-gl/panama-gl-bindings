// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSECONDARYCOLOR3BEXTPROC {

    void apply(byte red, byte green, byte blue);
    static MemorySegment allocate(PFNGLSECONDARYCOLOR3BEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3BEXTPROC.class, fi, constants$935.PFNGLSECONDARYCOLOR3BEXTPROC$FUNC, session);
    }
    static PFNGLSECONDARYCOLOR3BEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (byte _red, byte _green, byte _blue) -> {
            try {
                constants$935.PFNGLSECONDARYCOLOR3BEXTPROC$MH.invokeExact((Addressable)symbol, _red, _green, _blue);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

