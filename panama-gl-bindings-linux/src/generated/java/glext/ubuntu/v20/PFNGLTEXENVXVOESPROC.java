// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXENVXVOESPROC {

    void apply(int target, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLTEXENVXVOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXENVXVOESPROC.class, fi, constants$584.PFNGLTEXENVXVOESPROC$FUNC, session);
    }
    static PFNGLTEXENVXVOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$584.PFNGLTEXENVXVOESPROC$MH.invokeExact((Addressable)symbol, _target, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


