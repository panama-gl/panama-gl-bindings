// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK {

    int apply(java.lang.foreign.MemoryAddress pCert, java.lang.foreign.MemoryAddress pvFindArg);
    static MemorySegment allocate(PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK.class, fi, constants$809.PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK$FUNC, session);
    }
    static PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pCert, java.lang.foreign.MemoryAddress _pvFindArg) -> {
            try {
                return (int)constants$809.PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pCert, (java.lang.foreign.Addressable)_pvFindArg);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


