// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETFRAGMENTMATERIALIVSGIXPROC {

    void apply(int face, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETFRAGMENTMATERIALIVSGIXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETFRAGMENTMATERIALIVSGIXPROC.class, fi, constants$1298.PFNGLGETFRAGMENTMATERIALIVSGIXPROC$FUNC, session);
    }
    static PFNGLGETFRAGMENTMATERIALIVSGIXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _face, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$1298.PFNGLGETFRAGMENTMATERIALIVSGIXPROC$MH.invokeExact((Addressable)symbol, _face, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

