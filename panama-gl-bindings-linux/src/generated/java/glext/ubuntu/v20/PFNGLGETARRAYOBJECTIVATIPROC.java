// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETARRAYOBJECTIVATIPROC {

    void apply(int array, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETARRAYOBJECTIVATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETARRAYOBJECTIVATIPROC.class, fi, constants$498.PFNGLGETARRAYOBJECTIVATIPROC$FUNC, session);
    }
    static PFNGLGETARRAYOBJECTIVATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _array, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$498.PFNGLGETARRAYOBJECTIVATIPROC$MH.invokeExact((Addressable)symbol, _array, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


