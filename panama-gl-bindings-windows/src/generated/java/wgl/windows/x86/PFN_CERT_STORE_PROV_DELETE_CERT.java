// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CERT_STORE_PROV_DELETE_CERT {

    int apply(java.lang.foreign.MemoryAddress hStoreProv, java.lang.foreign.MemoryAddress pCertContext, int dwFlags);
    static MemorySegment allocate(PFN_CERT_STORE_PROV_DELETE_CERT fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CERT_STORE_PROV_DELETE_CERT.class, fi, constants$767.PFN_CERT_STORE_PROV_DELETE_CERT$FUNC, session);
    }
    static PFN_CERT_STORE_PROV_DELETE_CERT ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hStoreProv, java.lang.foreign.MemoryAddress _pCertContext, int _dwFlags) -> {
            try {
                return (int)constants$767.PFN_CERT_STORE_PROV_DELETE_CERT$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hStoreProv, (java.lang.foreign.Addressable)_pCertContext, _dwFlags);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


