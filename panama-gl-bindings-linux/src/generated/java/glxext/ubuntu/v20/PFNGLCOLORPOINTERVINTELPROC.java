// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOLORPOINTERVINTELPROC {

    void apply(int size, int type, java.lang.foreign.MemoryAddress pointer);
    static MemorySegment allocate(PFNGLCOLORPOINTERVINTELPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOLORPOINTERVINTELPROC.class, fi, constants$792.PFNGLCOLORPOINTERVINTELPROC$FUNC, session);
    }
    static PFNGLCOLORPOINTERVINTELPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _size, int _type, java.lang.foreign.MemoryAddress _pointer) -> {
            try {
                constants$792.PFNGLCOLORPOINTERVINTELPROC$MH.invokeExact((Addressable)symbol, _size, _type, (java.lang.foreign.Addressable)_pointer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


