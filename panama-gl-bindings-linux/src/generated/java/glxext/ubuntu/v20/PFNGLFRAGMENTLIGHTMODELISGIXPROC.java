// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFRAGMENTLIGHTMODELISGIXPROC {

    void apply(int pname, int param);
    static MemorySegment allocate(PFNGLFRAGMENTLIGHTMODELISGIXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTLIGHTMODELISGIXPROC.class, fi, constants$980.PFNGLFRAGMENTLIGHTMODELISGIXPROC$FUNC, session);
    }
    static PFNGLFRAGMENTLIGHTMODELISGIXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pname, int _param) -> {
            try {
                constants$980.PFNGLFRAGMENTLIGHTMODELISGIXPROC$MH.invokeExact((Addressable)symbol, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


