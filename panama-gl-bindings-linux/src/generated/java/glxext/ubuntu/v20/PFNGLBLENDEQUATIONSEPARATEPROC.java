// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBLENDEQUATIONSEPARATEPROC {

    void apply(int modeRGB, int modeAlpha);
    static MemorySegment allocate(PFNGLBLENDEQUATIONSEPARATEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBLENDEQUATIONSEPARATEPROC.class, fi, constants$198.PFNGLBLENDEQUATIONSEPARATEPROC$FUNC, session);
    }
    static PFNGLBLENDEQUATIONSEPARATEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _modeRGB, int _modeAlpha) -> {
            try {
                constants$198.PFNGLBLENDEQUATIONSEPARATEPROC$MH.invokeExact((Addressable)symbol, _modeRGB, _modeAlpha);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


