// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBLENDEQUATIONSEPARATEEXTPROC {

    void apply(int modeRGB, int modeAlpha);
    static MemorySegment allocate(PFNGLBLENDEQUATIONSEPARATEEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBLENDEQUATIONSEPARATEEXTPROC.class, fi, constants$517.PFNGLBLENDEQUATIONSEPARATEEXTPROC$FUNC, session);
    }
    static PFNGLBLENDEQUATIONSEPARATEEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _modeRGB, int _modeAlpha) -> {
            try {
                constants$517.PFNGLBLENDEQUATIONSEPARATEEXTPROC$MH.invokeExact((Addressable)symbol, _modeRGB, _modeAlpha);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


