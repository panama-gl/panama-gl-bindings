// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETCONVOLUTIONPARAMETERXVOESPROC {

    void apply(int target, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETCONVOLUTIONPARAMETERXVOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETCONVOLUTIONPARAMETERXVOESPROC.class, fi, constants$590.PFNGLGETCONVOLUTIONPARAMETERXVOESPROC$FUNC, session);
    }
    static PFNGLGETCONVOLUTIONPARAMETERXVOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$590.PFNGLGETCONVOLUTIONPARAMETERXVOESPROC$MH.invokeExact((Addressable)symbol, _target, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


