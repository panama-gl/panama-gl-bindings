// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFRAGMENTLIGHTMODELFVSGIXPROC {

    void apply(int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLFRAGMENTLIGHTMODELFVSGIXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTLIGHTMODELFVSGIXPROC.class, fi, constants$895.PFNGLFRAGMENTLIGHTMODELFVSGIXPROC$FUNC, session);
    }
    static PFNGLFRAGMENTLIGHTMODELFVSGIXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$895.PFNGLFRAGMENTLIGHTMODELFVSGIXPROC$MH.invokeExact((Addressable)symbol, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


