// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETINTEGERI_VPROC {

    void apply(int target, int index, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(PFNGLGETINTEGERI_VPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETINTEGERI_VPROC.class, fi, constants$232.PFNGLGETINTEGERI_VPROC$FUNC, session);
    }
    static PFNGLGETINTEGERI_VPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _index, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$232.PFNGLGETINTEGERI_VPROC$MH.invokeExact((Addressable)symbol, _target, _index, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


