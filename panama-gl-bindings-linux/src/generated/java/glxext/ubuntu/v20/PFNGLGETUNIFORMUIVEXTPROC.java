// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETUNIFORMUIVEXTPROC {

    void apply(int program, int location, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETUNIFORMUIVEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETUNIFORMUIVEXTPROC.class, fi, constants$717.PFNGLGETUNIFORMUIVEXTPROC$FUNC, session);
    }
    static PFNGLGETUNIFORMUIVEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program, int _location, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$717.PFNGLGETUNIFORMUIVEXTPROC$MH.invokeExact((Addressable)symbol, _program, _location, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

