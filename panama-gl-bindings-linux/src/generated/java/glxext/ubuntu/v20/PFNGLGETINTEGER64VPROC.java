// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETINTEGER64VPROC {

    void apply(int pname, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(PFNGLGETINTEGER64VPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETINTEGER64VPROC.class, fi, constants$267.PFNGLGETINTEGER64VPROC$FUNC, session);
    }
    static PFNGLGETINTEGER64VPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pname, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$267.PFNGLGETINTEGER64VPROC$MH.invokeExact((Addressable)symbol, _pname, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


