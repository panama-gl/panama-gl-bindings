// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETVARIANTARRAYOBJECTFVATIPROC {

    void apply(int id, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETVARIANTARRAYOBJECTFVATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETVARIANTARRAYOBJECTFVATIPROC.class, fi, constants$584.PFNGLGETVARIANTARRAYOBJECTFVATIPROC$FUNC, session);
    }
    static PFNGLGETVARIANTARRAYOBJECTFVATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$584.PFNGLGETVARIANTARRAYOBJECTFVATIPROC$MH.invokeExact((Addressable)symbol, _id, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


