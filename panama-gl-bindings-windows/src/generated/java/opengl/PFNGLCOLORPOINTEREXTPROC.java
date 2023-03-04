// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOLORPOINTEREXTPROC {

    void apply(int size, int type, int stride, int count, java.lang.foreign.MemoryAddress pointer);
    static MemorySegment allocate(PFNGLCOLORPOINTEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOLORPOINTEREXTPROC.class, fi, constants$696.PFNGLCOLORPOINTEREXTPROC$FUNC, session);
    }
    static PFNGLCOLORPOINTEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _size, int _type, int _stride, int _count, java.lang.foreign.MemoryAddress _pointer) -> {
            try {
                constants$697.PFNGLCOLORPOINTEREXTPROC$MH.invokeExact((Addressable)symbol, _size, _type, _stride, _count, (java.lang.foreign.Addressable)_pointer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


