// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBLENDFUNCSEPARATEIPROC {

    void apply(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);
    static MemorySegment allocate(PFNGLBLENDFUNCSEPARATEIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBLENDFUNCSEPARATEIPROC.class, fi, constants$205.PFNGLBLENDFUNCSEPARATEIPROC$FUNC, session);
    }
    static PFNGLBLENDFUNCSEPARATEIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _buf, int _srcRGB, int _dstRGB, int _srcAlpha, int _dstAlpha) -> {
            try {
                constants$205.PFNGLBLENDFUNCSEPARATEIPROC$MH.invokeExact((Addressable)symbol, _buf, _srcRGB, _dstRGB, _srcAlpha, _dstAlpha);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


