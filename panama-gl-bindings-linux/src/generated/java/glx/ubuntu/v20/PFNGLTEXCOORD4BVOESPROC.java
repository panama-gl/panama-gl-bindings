// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXCOORD4BVOESPROC {

    void apply(java.lang.foreign.MemoryAddress coords);
    static MemorySegment allocate(PFNGLTEXCOORD4BVOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD4BVOESPROC.class, fi, constants$496.PFNGLTEXCOORD4BVOESPROC$FUNC, session);
    }
    static PFNGLTEXCOORD4BVOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _coords) -> {
            try {
                constants$496.PFNGLTEXCOORD4BVOESPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_coords);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


