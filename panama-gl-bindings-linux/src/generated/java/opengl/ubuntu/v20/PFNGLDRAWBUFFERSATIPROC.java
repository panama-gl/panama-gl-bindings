// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDRAWBUFFERSATIPROC {

    void apply(int n, java.lang.foreign.MemoryAddress bufs);
    static MemorySegment allocate(PFNGLDRAWBUFFERSATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDRAWBUFFERSATIPROC.class, fi, constants$486.PFNGLDRAWBUFFERSATIPROC$FUNC, session);
    }
    static PFNGLDRAWBUFFERSATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, java.lang.foreign.MemoryAddress _bufs) -> {
            try {
                constants$486.PFNGLDRAWBUFFERSATIPROC$MH.invokeExact((Addressable)symbol, _n, (java.lang.foreign.Addressable)_bufs);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


