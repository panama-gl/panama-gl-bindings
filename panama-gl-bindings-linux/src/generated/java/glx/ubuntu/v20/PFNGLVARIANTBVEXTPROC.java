// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVARIANTBVEXTPROC {

    void apply(int id, java.lang.foreign.MemoryAddress addr);
    static MemorySegment allocate(PFNGLVARIANTBVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVARIANTBVEXTPROC.class, fi, constants$772.PFNGLVARIANTBVEXTPROC$FUNC, session);
    }
    static PFNGLVARIANTBVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id, java.lang.foreign.MemoryAddress _addr) -> {
            try {
                constants$772.PFNGLVARIANTBVEXTPROC$MH.invokeExact((Addressable)symbol, _id, (java.lang.foreign.Addressable)_addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


