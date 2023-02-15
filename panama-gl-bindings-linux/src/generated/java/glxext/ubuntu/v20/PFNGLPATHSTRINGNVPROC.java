// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPATHSTRINGNVPROC {

    void apply(int path, int format, int length, java.lang.foreign.MemoryAddress pathString);
    static MemorySegment allocate(PFNGLPATHSTRINGNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPATHSTRINGNVPROC.class, fi, constants$874.PFNGLPATHSTRINGNVPROC$FUNC, session);
    }
    static PFNGLPATHSTRINGNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _path, int _format, int _length, java.lang.foreign.MemoryAddress _pathString) -> {
            try {
                constants$874.PFNGLPATHSTRINGNVPROC$MH.invokeExact((Addressable)symbol, _path, _format, _length, (java.lang.foreign.Addressable)_pathString);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


