// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROGRAMNAMEDPARAMETER4FNVPROC {

    void apply(int id, int len, java.lang.foreign.MemoryAddress name, float x, float y, float z, float w);
    static MemorySegment allocate(PFNGLPROGRAMNAMEDPARAMETER4FNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMNAMEDPARAMETER4FNVPROC.class, fi, constants$1077.PFNGLPROGRAMNAMEDPARAMETER4FNVPROC$FUNC, session);
    }
    static PFNGLPROGRAMNAMEDPARAMETER4FNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id, int _len, java.lang.foreign.MemoryAddress _name, float _x, float _y, float _z, float _w) -> {
            try {
                constants$1078.PFNGLPROGRAMNAMEDPARAMETER4FNVPROC$MH.invokeExact((Addressable)symbol, _id, _len, (java.lang.foreign.Addressable)_name, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

