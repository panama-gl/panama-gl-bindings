// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMINSAMPLESHADINGPROC {

    void apply(float value);
    static MemorySegment allocate(PFNGLMINSAMPLESHADINGPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMINSAMPLESHADINGPROC.class, fi, constants$204.PFNGLMINSAMPLESHADINGPROC$FUNC, session);
    }
    static PFNGLMINSAMPLESHADINGPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _value) -> {
            try {
                constants$204.PFNGLMINSAMPLESHADINGPROC$MH.invokeExact((Addressable)symbol, _value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


