// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETINTERNALFORMATI64VPROC {

    void apply(int target, int internalformat, int pname, int bufSize, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETINTERNALFORMATI64VPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETINTERNALFORMATI64VPROC.class, fi, constants$255.PFNGLGETINTERNALFORMATI64VPROC$FUNC, session);
    }
    static PFNGLGETINTERNALFORMATI64VPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _internalformat, int _pname, int _bufSize, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$255.PFNGLGETINTERNALFORMATI64VPROC$MH.invokeExact((Addressable)symbol, _target, _internalformat, _pname, _bufSize, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


