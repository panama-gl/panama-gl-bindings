// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORD1BVOESPROC {

    void apply(int texture, java.lang.foreign.MemoryAddress coords);
    static MemorySegment allocate(PFNGLMULTITEXCOORD1BVOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD1BVOESPROC.class, fi, constants$406.PFNGLMULTITEXCOORD1BVOESPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORD1BVOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, java.lang.foreign.MemoryAddress _coords) -> {
            try {
                constants$406.PFNGLMULTITEXCOORD1BVOESPROC$MH.invokeExact((Addressable)symbol, _texture, (java.lang.foreign.Addressable)_coords);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


