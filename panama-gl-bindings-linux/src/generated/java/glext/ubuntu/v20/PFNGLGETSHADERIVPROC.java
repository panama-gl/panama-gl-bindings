// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETSHADERIVPROC {

    void apply(int shader, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETSHADERIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETSHADERIVPROC.class, fi, constants$120.PFNGLGETSHADERIVPROC$FUNC, session);
    }
    static PFNGLGETSHADERIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _shader, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$120.PFNGLGETSHADERIVPROC$MH.invokeExact((Addressable)symbol, _shader, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


