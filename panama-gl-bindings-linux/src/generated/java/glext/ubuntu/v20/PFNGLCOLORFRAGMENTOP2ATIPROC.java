// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOLORFRAGMENTOP2ATIPROC {

    void apply(int op, int dst, int dstMask, int dstMod, int arg1, int arg1Rep, int arg1Mod, int arg2, int arg2Rep, int arg2Mod);
    static MemorySegment allocate(PFNGLCOLORFRAGMENTOP2ATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOLORFRAGMENTOP2ATIPROC.class, fi, constants$689.PFNGLCOLORFRAGMENTOP2ATIPROC$FUNC, session);
    }
    static PFNGLCOLORFRAGMENTOP2ATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _op, int _dst, int _dstMask, int _dstMod, int _arg1, int _arg1Rep, int _arg1Mod, int _arg2, int _arg2Rep, int _arg2Mod) -> {
            try {
                constants$689.PFNGLCOLORFRAGMENTOP2ATIPROC$MH.invokeExact((Addressable)symbol, _op, _dst, _dstMask, _dstMod, _arg1, _arg1Rep, _arg1Mod, _arg2, _arg2Rep, _arg2Mod);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

