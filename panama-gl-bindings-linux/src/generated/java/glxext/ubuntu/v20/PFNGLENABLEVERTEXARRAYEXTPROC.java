// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLENABLEVERTEXARRAYEXTPROC {

    void apply(int vaobj, int array);
    static MemorySegment allocate(PFNGLENABLEVERTEXARRAYEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLENABLEVERTEXARRAYEXTPROC.class, fi, constants$690.PFNGLENABLEVERTEXARRAYEXTPROC$FUNC, session);
    }
    static PFNGLENABLEVERTEXARRAYEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _vaobj, int _array) -> {
            try {
                constants$690.PFNGLENABLEVERTEXARRAYEXTPROC$MH.invokeExact((Addressable)symbol, _vaobj, _array);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

