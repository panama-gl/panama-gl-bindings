// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETCOLORTABLEPARAMETERIVEXTPROC {

    void apply(int target, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETCOLORTABLEPARAMETERIVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETCOLORTABLEPARAMETERIVEXTPROC.class, fi, constants$700.PFNGLGETCOLORTABLEPARAMETERIVEXTPROC$FUNC, session);
    }
    static PFNGLGETCOLORTABLEPARAMETERIVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$700.PFNGLGETCOLORTABLEPARAMETERIVEXTPROC$MH.invokeExact((Addressable)symbol, _target, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


