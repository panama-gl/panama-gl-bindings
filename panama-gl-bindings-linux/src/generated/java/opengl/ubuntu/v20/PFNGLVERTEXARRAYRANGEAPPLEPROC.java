// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXARRAYRANGEAPPLEPROC {

    void apply(int length, java.lang.foreign.MemoryAddress pointer);
    static MemorySegment allocate(PFNGLVERTEXARRAYRANGEAPPLEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYRANGEAPPLEPROC.class, fi, constants$483.PFNGLVERTEXARRAYRANGEAPPLEPROC$FUNC, session);
    }
    static PFNGLVERTEXARRAYRANGEAPPLEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _length, java.lang.foreign.MemoryAddress _pointer) -> {
            try {
                constants$483.PFNGLVERTEXARRAYRANGEAPPLEPROC$MH.invokeExact((Addressable)symbol, _length, (java.lang.foreign.Addressable)_pointer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


