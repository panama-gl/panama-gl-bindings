// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXTUREPARAMETERIUIVPROC {

    void apply(int texture, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLTEXTUREPARAMETERIUIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREPARAMETERIUIVPROC.class, fi, constants$292.PFNGLTEXTUREPARAMETERIUIVPROC$FUNC, session);
    }
    static PFNGLTEXTUREPARAMETERIUIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$292.PFNGLTEXTUREPARAMETERIUIVPROC$MH.invokeExact((Addressable)symbol, _texture, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


