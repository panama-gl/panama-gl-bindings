// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXCOORD3BVOESPROC {

    void apply(java.lang.foreign.MemoryAddress coords);
    static MemorySegment allocate(PFNGLTEXCOORD3BVOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD3BVOESPROC.class, fi, constants$496.PFNGLTEXCOORD3BVOESPROC$FUNC, session);
    }
    static PFNGLTEXCOORD3BVOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _coords) -> {
            try {
                constants$496.PFNGLTEXCOORD3BVOESPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_coords);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


