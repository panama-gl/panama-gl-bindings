// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETUNIFORMUI64VNVPROC {

    void apply(int program, int location, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETUNIFORMUI64VNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETUNIFORMUI64VNVPROC.class, fi, constants$546.PFNGLGETUNIFORMUI64VNVPROC$FUNC, session);
    }
    static PFNGLGETUNIFORMUI64VNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$546.PFNGLGETUNIFORMUI64VNVPROC$MH.invokeExact((Addressable)symbol, _program, _location, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

