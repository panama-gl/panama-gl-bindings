// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETINTERNALFORMATIVPROC {

    void apply(int target, int internalformat, int pname, int bufSize, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETINTERNALFORMATIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETINTERNALFORMATIVPROC.class, fi, constants$335.PFNGLGETINTERNALFORMATIVPROC$FUNC, session);
    }
    static PFNGLGETINTERNALFORMATIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _internalformat, int _pname, int _bufSize, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$335.PFNGLGETINTERNALFORMATIVPROC$MH.invokeExact((Addressable)symbol, _target, _internalformat, _pname, _bufSize, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

