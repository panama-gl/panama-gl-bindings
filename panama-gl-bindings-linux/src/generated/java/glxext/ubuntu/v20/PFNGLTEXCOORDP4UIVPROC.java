// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXCOORDP4UIVPROC {

    void apply(int type, java.lang.foreign.MemoryAddress coords);
    static MemorySegment allocate(PFNGLTEXCOORDP4UIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORDP4UIVPROC.class, fi, constants$283.PFNGLTEXCOORDP4UIVPROC$FUNC, session);
    }
    static PFNGLTEXCOORDP4UIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _type, java.lang.foreign.MemoryAddress _coords) -> {
            try {
                constants$283.PFNGLTEXCOORDP4UIVPROC$MH.invokeExact((Addressable)symbol, _type, (java.lang.foreign.Addressable)_coords);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


