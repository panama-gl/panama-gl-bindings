// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFRAGMENTMATERIALISGIXPROC {

    void apply(int face, int pname, int param);
    static MemorySegment allocate(PFNGLFRAGMENTMATERIALISGIXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTMATERIALISGIXPROC.class, fi, constants$896.PFNGLFRAGMENTMATERIALISGIXPROC$FUNC, session);
    }
    static PFNGLFRAGMENTMATERIALISGIXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _face, int _pname, int _param) -> {
            try {
                constants$896.PFNGLFRAGMENTMATERIALISGIXPROC$MH.invokeExact((Addressable)symbol, _face, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


