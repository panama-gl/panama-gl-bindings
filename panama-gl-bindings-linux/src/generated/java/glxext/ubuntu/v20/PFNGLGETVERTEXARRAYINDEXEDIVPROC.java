// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETVERTEXARRAYINDEXEDIVPROC {

    void apply(int vaobj, int index, int pname, java.lang.foreign.MemoryAddress param);
    static MemorySegment allocate(PFNGLGETVERTEXARRAYINDEXEDIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETVERTEXARRAYINDEXEDIVPROC.class, fi, constants$385.PFNGLGETVERTEXARRAYINDEXEDIVPROC$FUNC, session);
    }
    static PFNGLGETVERTEXARRAYINDEXEDIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _vaobj, int _index, int _pname, java.lang.foreign.MemoryAddress _param) -> {
            try {
                constants$385.PFNGLGETVERTEXARRAYINDEXEDIVPROC$MH.invokeExact((Addressable)symbol, _vaobj, _index, _pname, (java.lang.foreign.Addressable)_param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

