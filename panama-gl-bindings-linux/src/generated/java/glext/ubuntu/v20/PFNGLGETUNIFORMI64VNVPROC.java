// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETUNIFORMI64VNVPROC {

    void apply(int program, int location, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETUNIFORMI64VNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETUNIFORMI64VNVPROC.class, fi, constants$642.PFNGLGETUNIFORMI64VNVPROC$FUNC, session);
    }
    static PFNGLGETUNIFORMI64VNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$642.PFNGLGETUNIFORMI64VNVPROC$MH.invokeExact((Addressable)symbol, _program, _location, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


