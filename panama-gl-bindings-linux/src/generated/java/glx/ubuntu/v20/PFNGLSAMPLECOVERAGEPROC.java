// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSAMPLECOVERAGEPROC {

    void apply(float value, byte invert);
    static MemorySegment allocate(PFNGLSAMPLECOVERAGEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSAMPLECOVERAGEPROC.class, fi, constants$157.PFNGLSAMPLECOVERAGEPROC$FUNC, session);
    }
    static PFNGLSAMPLECOVERAGEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _value, byte _invert) -> {
            try {
                constants$157.PFNGLSAMPLECOVERAGEPROC$MH.invokeExact((Addressable)symbol, _value, _invert);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

