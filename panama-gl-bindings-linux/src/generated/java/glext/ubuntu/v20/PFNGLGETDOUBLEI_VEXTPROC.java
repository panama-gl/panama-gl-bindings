// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETDOUBLEI_VEXTPROC {

    void apply(int pname, int index, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETDOUBLEI_VEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETDOUBLEI_VEXTPROC.class, fi, constants$590.PFNGLGETDOUBLEI_VEXTPROC$FUNC, session);
    }
    static PFNGLGETDOUBLEI_VEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _pname, int _index, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$590.PFNGLGETDOUBLEI_VEXTPROC$MH.invokeExact((Addressable)symbol, _pname, _index, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


