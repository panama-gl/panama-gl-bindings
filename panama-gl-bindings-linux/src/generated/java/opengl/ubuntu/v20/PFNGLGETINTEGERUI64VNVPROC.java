// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETINTEGERUI64VNVPROC {

    void apply(int value, java.lang.foreign.MemoryAddress result);
    static MemorySegment allocate(PFNGLGETINTEGERUI64VNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETINTEGERUI64VNVPROC.class, fi, constants$822.PFNGLGETINTEGERUI64VNVPROC$FUNC, session);
    }
    static PFNGLGETINTEGERUI64VNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _value, java.lang.foreign.MemoryAddress _result) -> {
            try {
                constants$822.PFNGLGETINTEGERUI64VNVPROC$MH.invokeExact((Addressable)symbol, _value, (java.lang.foreign.Addressable)_result);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


