// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETUNIFORMSUBROUTINEUIVPROC {

    void apply(int shadertype, int location, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETUNIFORMSUBROUTINEUIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETUNIFORMSUBROUTINEUIVPROC.class, fi, constants$270.PFNGLGETUNIFORMSUBROUTINEUIVPROC$FUNC, session);
    }
    static PFNGLGETUNIFORMSUBROUTINEUIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _shadertype, int _location, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$270.PFNGLGETUNIFORMSUBROUTINEUIVPROC$MH.invokeExact((Addressable)symbol, _shadertype, _location, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

