// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINORMAL3BEXTPROC {

    void apply(byte bx, byte by, byte bz);
    static MemorySegment allocate(PFNGLBINORMAL3BEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINORMAL3BEXTPROC.class, fi, constants$613.PFNGLBINORMAL3BEXTPROC$FUNC, session);
    }
    static PFNGLBINORMAL3BEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (byte _bx, byte _by, byte _bz) -> {
            try {
                constants$613.PFNGLBINORMAL3BEXTPROC$MH.invokeExact((Addressable)symbol, _bx, _by, _bz);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


