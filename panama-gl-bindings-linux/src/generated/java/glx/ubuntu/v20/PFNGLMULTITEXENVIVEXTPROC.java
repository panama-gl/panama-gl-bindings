// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXENVIVEXTPROC {

    void apply(int texunit, int target, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLMULTITEXENVIVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXENVIVEXTPROC.class, fi, constants$635.PFNGLMULTITEXENVIVEXTPROC$FUNC, session);
    }
    static PFNGLMULTITEXENVIVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texunit, int _target, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$635.PFNGLMULTITEXENVIVEXTPROC$MH.invokeExact((Addressable)symbol, _texunit, _target, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


