// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXCOORDP4UIPROC {

    void apply(int type, int coords);
    static MemorySegment allocate(PFNGLTEXCOORDP4UIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORDP4UIPROC.class, fi, constants$198.PFNGLTEXCOORDP4UIPROC$FUNC, session);
    }
    static PFNGLTEXCOORDP4UIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _type, int _coords) -> {
            try {
                constants$198.PFNGLTEXCOORDP4UIPROC$MH.invokeExact((Addressable)symbol, _type, _coords);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


