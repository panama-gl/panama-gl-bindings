// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMINSAMPLESHADINGARBPROC {

    void apply(float value);
    static MemorySegment allocate(PFNGLMINSAMPLESHADINGARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMINSAMPLESHADINGARBPROC.class, fi, constants$442.PFNGLMINSAMPLESHADINGARBPROC$FUNC, session);
    }
    static PFNGLMINSAMPLESHADINGARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _value) -> {
            try {
                constants$442.PFNGLMINSAMPLESHADINGARBPROC$MH.invokeExact((Addressable)symbol, _value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


