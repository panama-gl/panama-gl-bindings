// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CERT_ENUM_SYSTEM_STORE_LOCATION {

    int apply(java.lang.foreign.MemoryAddress pwszStoreLocation, int dwFlags, java.lang.foreign.MemoryAddress pvReserved, java.lang.foreign.MemoryAddress pvArg);
    static MemorySegment allocate(PFN_CERT_ENUM_SYSTEM_STORE_LOCATION fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CERT_ENUM_SYSTEM_STORE_LOCATION.class, fi, constants$784.PFN_CERT_ENUM_SYSTEM_STORE_LOCATION$FUNC, session);
    }
    static PFN_CERT_ENUM_SYSTEM_STORE_LOCATION ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pwszStoreLocation, int _dwFlags, java.lang.foreign.MemoryAddress _pvReserved, java.lang.foreign.MemoryAddress _pvArg) -> {
            try {
                return (int)constants$785.PFN_CERT_ENUM_SYSTEM_STORE_LOCATION$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pwszStoreLocation, _dwFlags, (java.lang.foreign.Addressable)_pvReserved, (java.lang.foreign.Addressable)_pvArg);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


