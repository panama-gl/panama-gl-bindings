// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXGENFVEXTPROC {

    void apply(int texunit, int coord, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLMULTITEXGENFVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXGENFVEXTPROC.class, fi, constants$551.PFNGLMULTITEXGENFVEXTPROC$FUNC, session);
    }
    static PFNGLMULTITEXGENFVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texunit, int _coord, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$551.PFNGLMULTITEXGENFVEXTPROC$MH.invokeExact((Addressable)symbol, _texunit, _coord, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


