// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETCOLORTABLEEXTPROC {

    void apply(int target, int format, int type, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(PFNGLGETCOLORTABLEEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETCOLORTABLEEXTPROC.class, fi, constants$700.PFNGLGETCOLORTABLEEXTPROC$FUNC, session);
    }
    static PFNGLGETCOLORTABLEEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _format, int _type, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$700.PFNGLGETCOLORTABLEEXTPROC$MH.invokeExact((Addressable)symbol, _target, _format, _type, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


