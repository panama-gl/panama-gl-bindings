// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXPOINTERVINTELPROC {

    void apply(int size, int type, java.lang.foreign.MemoryAddress pointer);
    static MemorySegment allocate(PFNGLVERTEXPOINTERVINTELPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXPOINTERVINTELPROC.class, fi, constants$791.PFNGLVERTEXPOINTERVINTELPROC$FUNC, session);
    }
    static PFNGLVERTEXPOINTERVINTELPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _size, int _type, java.lang.foreign.MemoryAddress _pointer) -> {
            try {
                constants$791.PFNGLVERTEXPOINTERVINTELPROC$MH.invokeExact((Addressable)symbol, _size, _type, (java.lang.foreign.Addressable)_pointer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

