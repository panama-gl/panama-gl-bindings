// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXCOORD2BVOESPROC {

    void apply(java.lang.foreign.MemoryAddress coords);
    static MemorySegment allocate(PFNGLTEXCOORD2BVOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD2BVOESPROC.class, fi, constants$410.PFNGLTEXCOORD2BVOESPROC$FUNC, session);
    }
    static PFNGLTEXCOORD2BVOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _coords) -> {
            try {
                constants$410.PFNGLTEXCOORD2BVOESPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_coords);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


