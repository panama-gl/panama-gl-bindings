// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFRAGMENTMATERIALFSGIXPROC {

    void apply(int face, int pname, float param);
    static MemorySegment allocate(PFNGLFRAGMENTMATERIALFSGIXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTMATERIALFSGIXPROC.class, fi, constants$981.PFNGLFRAGMENTMATERIALFSGIXPROC$FUNC, session);
    }
    static PFNGLFRAGMENTMATERIALFSGIXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _face, int _pname, float _param) -> {
            try {
                constants$981.PFNGLFRAGMENTMATERIALFSGIXPROC$MH.invokeExact((Addressable)symbol, _face, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


