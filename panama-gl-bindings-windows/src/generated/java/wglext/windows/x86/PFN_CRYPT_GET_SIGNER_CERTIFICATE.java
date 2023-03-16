// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CRYPT_GET_SIGNER_CERTIFICATE {

    java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress pvGetArg, int dwCertEncodingType, java.lang.foreign.MemoryAddress pSignerId, java.lang.foreign.MemoryAddress hMsgCertStore);
    static MemorySegment allocate(PFN_CRYPT_GET_SIGNER_CERTIFICATE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CRYPT_GET_SIGNER_CERTIFICATE.class, fi, constants$798.PFN_CRYPT_GET_SIGNER_CERTIFICATE$FUNC, session);
    }
    static PFN_CRYPT_GET_SIGNER_CERTIFICATE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pvGetArg, int _dwCertEncodingType, java.lang.foreign.MemoryAddress _pSignerId, java.lang.foreign.MemoryAddress _hMsgCertStore) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$798.PFN_CRYPT_GET_SIGNER_CERTIFICATE$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pvGetArg, _dwCertEncodingType, (java.lang.foreign.Addressable)_pSignerId, (java.lang.foreign.Addressable)_hMsgCertStore);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


