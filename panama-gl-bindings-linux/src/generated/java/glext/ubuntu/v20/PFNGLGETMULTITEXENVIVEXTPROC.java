// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETMULTITEXENVIVEXTPROC {

    void apply(int texunit, int target, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETMULTITEXENVIVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETMULTITEXENVIVEXTPROC.class, fi, constants$552.PFNGLGETMULTITEXENVIVEXTPROC$FUNC, session);
    }
    static PFNGLGETMULTITEXENVIVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texunit, int _target, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$552.PFNGLGETMULTITEXENVIVEXTPROC$MH.invokeExact((Addressable)symbol, _texunit, _target, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


