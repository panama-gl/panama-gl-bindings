// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNUNIFORMUIVPROC {

    void apply(int program, int location, int bufSize, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETNUNIFORMUIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNUNIFORMUIVPROC.class, fi, constants$391.PFNGLGETNUNIFORMUIVPROC$FUNC, session);
    }
    static PFNGLGETNUNIFORMUIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, int _bufSize, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$391.PFNGLGETNUNIFORMUIVPROC$MH.invokeExact((Addressable)symbol, _program, _location, _bufSize, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


