// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETTEXTUREPARAMETERIVPROC {

    void apply(int texture, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETTEXTUREPARAMETERIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTUREPARAMETERIVPROC.class, fi, constants$295.PFNGLGETTEXTUREPARAMETERIVPROC$FUNC, session);
    }
    static PFNGLGETTEXTUREPARAMETERIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texture, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$295.PFNGLGETTEXTUREPARAMETERIVPROC$MH.invokeExact((Addressable)symbol, _texture, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


