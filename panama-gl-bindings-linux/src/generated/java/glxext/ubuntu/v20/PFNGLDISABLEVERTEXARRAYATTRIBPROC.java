// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDISABLEVERTEXARRAYATTRIBPROC {

    void apply(int vaobj, int index);
    static MemorySegment allocate(PFNGLDISABLEVERTEXARRAYATTRIBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDISABLEVERTEXARRAYATTRIBPROC.class, fi, constants$381.PFNGLDISABLEVERTEXARRAYATTRIBPROC$FUNC, session);
    }
    static PFNGLDISABLEVERTEXARRAYATTRIBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _vaobj, int _index) -> {
            try {
                constants$381.PFNGLDISABLEVERTEXARRAYATTRIBPROC$MH.invokeExact((Addressable)symbol, _vaobj, _index);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


