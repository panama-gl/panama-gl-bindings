// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTUREMATERIALEXTPROC {

    void apply(int face, int mode);
    static MemorySegment allocate(PFNGLTEXTUREMATERIALEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREMATERIALEXTPROC.class, fi, constants$725.PFNGLTEXTUREMATERIALEXTPROC$FUNC, session);
    }
    static PFNGLTEXTUREMATERIALEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _face, int _mode) -> {
            try {
                constants$725.PFNGLTEXTUREMATERIALEXTPROC$MH.invokeExact((Addressable)symbol, _face, _mode);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


