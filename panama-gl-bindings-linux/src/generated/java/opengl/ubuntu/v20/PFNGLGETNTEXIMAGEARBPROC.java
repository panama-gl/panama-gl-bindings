// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNTEXIMAGEARBPROC {

    void apply(int target, int level, int format, int type, int bufSize, java.lang.foreign.MemoryAddress img);
    static MemorySegment allocate(PFNGLGETNTEXIMAGEARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNTEXIMAGEARBPROC.class, fi, constants$350.PFNGLGETNTEXIMAGEARBPROC$FUNC, session);
    }
    static PFNGLGETNTEXIMAGEARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _level, int _format, int _type, int _bufSize, java.lang.foreign.MemoryAddress _img) -> {
            try {
                constants$350.PFNGLGETNTEXIMAGEARBPROC$MH.invokeExact((Addressable)symbol, _target, _level, _format, _type, _bufSize, (java.lang.foreign.Addressable)_img);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


