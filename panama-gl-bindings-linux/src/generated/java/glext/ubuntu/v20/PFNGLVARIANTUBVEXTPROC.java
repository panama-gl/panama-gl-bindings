// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVARIANTUBVEXTPROC {

    void apply(int id, java.lang.foreign.MemoryAddress addr);
    static MemorySegment allocate(PFNGLVARIANTUBVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVARIANTUBVEXTPROC.class, fi, constants$688.PFNGLVARIANTUBVEXTPROC$FUNC, session);
    }
    static PFNGLVARIANTUBVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id, java.lang.foreign.MemoryAddress _addr) -> {
            try {
                constants$688.PFNGLVARIANTUBVEXTPROC$MH.invokeExact((Addressable)symbol, _id, (java.lang.foreign.Addressable)_addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


