// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETPROGRAMINTERFACEIVPROC {

    void apply(int program, int programInterface, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETPROGRAMINTERFACEIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETPROGRAMINTERFACEIVPROC.class, fi, constants$343.PFNGLGETPROGRAMINTERFACEIVPROC$FUNC, session);
    }
    static PFNGLGETPROGRAMINTERFACEIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _programInterface, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$343.PFNGLGETPROGRAMINTERFACEIVPROC$MH.invokeExact((Addressable)symbol, _program, _programInterface, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


