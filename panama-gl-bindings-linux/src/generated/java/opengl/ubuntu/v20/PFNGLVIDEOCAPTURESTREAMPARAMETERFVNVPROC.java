// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVIDEOCAPTURESTREAMPARAMETERFVNVPROC {

    void apply(int video_capture_slot, int stream, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLVIDEOCAPTURESTREAMPARAMETERFVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVIDEOCAPTURESTREAMPARAMETERFVNVPROC.class, fi, constants$882.PFNGLVIDEOCAPTURESTREAMPARAMETERFVNVPROC$FUNC, session);
    }
    static PFNGLVIDEOCAPTURESTREAMPARAMETERFVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _video_capture_slot, int _stream, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$882.PFNGLVIDEOCAPTURESTREAMPARAMETERFVNVPROC$MH.invokeExact((Addressable)symbol, _video_capture_slot, _stream, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


