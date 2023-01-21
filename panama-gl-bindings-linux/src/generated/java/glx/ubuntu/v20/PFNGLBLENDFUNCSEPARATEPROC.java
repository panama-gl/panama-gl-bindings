// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBLENDFUNCSEPARATEPROC {

    void apply(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha);
    static MemorySegment allocate(PFNGLBLENDFUNCSEPARATEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBLENDFUNCSEPARATEPROC.class, fi, constants$176.PFNGLBLENDFUNCSEPARATEPROC$FUNC, session);
    }
    static PFNGLBLENDFUNCSEPARATEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _sfactorRGB, int _dfactorRGB, int _sfactorAlpha, int _dfactorAlpha) -> {
            try {
                constants$176.PFNGLBLENDFUNCSEPARATEPROC$MH.invokeExact((Addressable)symbol, _sfactorRGB, _dfactorRGB, _sfactorAlpha, _dfactorAlpha);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


