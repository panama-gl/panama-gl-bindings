// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PGET_MODULE_HANDLE_EXW {

    int apply(int dwFlags, java.lang.foreign.MemoryAddress lpModuleName, java.lang.foreign.MemoryAddress phModule);
    static MemorySegment allocate(PGET_MODULE_HANDLE_EXW fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PGET_MODULE_HANDLE_EXW.class, fi, constants$226.PGET_MODULE_HANDLE_EXW$FUNC, session);
    }
    static PGET_MODULE_HANDLE_EXW ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _dwFlags, java.lang.foreign.MemoryAddress _lpModuleName, java.lang.foreign.MemoryAddress _phModule) -> {
            try {
                return (int)constants$226.PGET_MODULE_HANDLE_EXW$MH.invokeExact((Addressable)symbol, _dwFlags, (java.lang.foreign.Addressable)_lpModuleName, (java.lang.foreign.Addressable)_phModule);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


