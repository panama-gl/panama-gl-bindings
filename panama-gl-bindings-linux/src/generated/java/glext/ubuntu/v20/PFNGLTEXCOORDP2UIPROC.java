// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXCOORDP2UIPROC {

    void apply(int type, int coords);
    static MemorySegment allocate(PFNGLTEXCOORDP2UIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORDP2UIPROC.class, fi, constants$243.PFNGLTEXCOORDP2UIPROC$FUNC, session);
    }
    static PFNGLTEXCOORDP2UIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _type, int _coords) -> {
            try {
                constants$243.PFNGLTEXCOORDP2UIPROC$MH.invokeExact((Addressable)symbol, _type, _coords);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


