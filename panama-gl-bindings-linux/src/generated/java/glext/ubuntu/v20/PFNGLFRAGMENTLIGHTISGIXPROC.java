// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFRAGMENTLIGHTISGIXPROC {

    void apply(int light, int pname, int param);
    static MemorySegment allocate(PFNGLFRAGMENTLIGHTISGIXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTLIGHTISGIXPROC.class, fi, constants$1293.PFNGLFRAGMENTLIGHTISGIXPROC$FUNC, session);
    }
    static PFNGLFRAGMENTLIGHTISGIXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _light, int _pname, int _param) -> {
            try {
                constants$1294.PFNGLFRAGMENTLIGHTISGIXPROC$MH.invokeExact((Addressable)symbol, _light, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

