// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINDFRAGDATALOCATIONPROC {

    void apply(int program, int color, java.lang.foreign.MemoryAddress name);
    static MemorySegment allocate(PFNGLBINDFRAGDATALOCATIONPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINDFRAGDATALOCATIONPROC.class, fi, constants$159.PFNGLBINDFRAGDATALOCATIONPROC$FUNC, session);
    }
    static PFNGLBINDFRAGDATALOCATIONPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _color, java.lang.foreign.MemoryAddress _name) -> {
            try {
                constants$159.PFNGLBINDFRAGDATALOCATIONPROC$MH.invokeExact((Addressable)symbol, _program, _color, (java.lang.foreign.Addressable)_name);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


