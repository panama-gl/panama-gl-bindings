// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLENABLEVERTEXARRAYATTRIBPROC {

    void apply(int vaobj, int index);
    static MemorySegment allocate(PFNGLENABLEVERTEXARRAYATTRIBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLENABLEVERTEXARRAYATTRIBPROC.class, fi, constants$382.PFNGLENABLEVERTEXARRAYATTRIBPROC$FUNC, session);
    }
    static PFNGLENABLEVERTEXARRAYATTRIBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _vaobj, int _index) -> {
            try {
                constants$382.PFNGLENABLEVERTEXARRAYATTRIBPROC$MH.invokeExact((Addressable)symbol, _vaobj, _index);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


