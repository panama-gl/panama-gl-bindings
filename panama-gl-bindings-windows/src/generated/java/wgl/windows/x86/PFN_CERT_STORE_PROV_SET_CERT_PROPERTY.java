// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CERT_STORE_PROV_SET_CERT_PROPERTY {

    int apply(java.lang.foreign.MemoryAddress hStoreProv, java.lang.foreign.MemoryAddress pCertContext, int dwPropId, int dwFlags, java.lang.foreign.MemoryAddress pvData);
    static MemorySegment allocate(PFN_CERT_STORE_PROV_SET_CERT_PROPERTY fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CERT_STORE_PROV_SET_CERT_PROPERTY.class, fi, constants$767.PFN_CERT_STORE_PROV_SET_CERT_PROPERTY$FUNC, session);
    }
    static PFN_CERT_STORE_PROV_SET_CERT_PROPERTY ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hStoreProv, java.lang.foreign.MemoryAddress _pCertContext, int _dwPropId, int _dwFlags, java.lang.foreign.MemoryAddress _pvData) -> {
            try {
                return (int)constants$768.PFN_CERT_STORE_PROV_SET_CERT_PROPERTY$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hStoreProv, (java.lang.foreign.Addressable)_pCertContext, _dwPropId, _dwFlags, (java.lang.foreign.Addressable)_pvData);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

