// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETINTEGERUI64I_VNVPROC {

    void apply(int value, int index, java.lang.foreign.MemoryAddress result);
    static MemorySegment allocate(PFNGLGETINTEGERUI64I_VNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETINTEGERUI64I_VNVPROC.class, fi, constants$849.PFNGLGETINTEGERUI64I_VNVPROC$FUNC, session);
    }
    static PFNGLGETINTEGERUI64I_VNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _value, int _index, java.lang.foreign.MemoryAddress _result) -> {
            try {
                constants$849.PFNGLGETINTEGERUI64I_VNVPROC$MH.invokeExact((Addressable)symbol, _value, _index, (java.lang.foreign.Addressable)_result);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


