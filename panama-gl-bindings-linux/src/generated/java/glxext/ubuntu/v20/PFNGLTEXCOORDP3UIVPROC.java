// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXCOORDP3UIVPROC {

    void apply(int type, java.lang.foreign.MemoryAddress coords);
    static MemorySegment allocate(PFNGLTEXCOORDP3UIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORDP3UIVPROC.class, fi, constants$283.PFNGLTEXCOORDP3UIVPROC$FUNC, session);
    }
    static PFNGLTEXCOORDP3UIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _type, java.lang.foreign.MemoryAddress _coords) -> {
            try {
                constants$283.PFNGLTEXCOORDP3UIVPROC$MH.invokeExact((Addressable)symbol, _type, (java.lang.foreign.Addressable)_coords);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


