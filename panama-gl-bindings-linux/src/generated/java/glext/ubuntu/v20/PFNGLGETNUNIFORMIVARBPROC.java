// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNUNIFORMIVARBPROC {

    void apply(int program, int location, int bufSize, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETNUNIFORMIVARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNUNIFORMIVARBPROC.class, fi, constants$479.PFNGLGETNUNIFORMIVARBPROC$FUNC, session);
    }
    static PFNGLGETNUNIFORMIVARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, int _bufSize, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$480.PFNGLGETNUNIFORMIVARBPROC$MH.invokeExact((Addressable)symbol, _program, _location, _bufSize, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


