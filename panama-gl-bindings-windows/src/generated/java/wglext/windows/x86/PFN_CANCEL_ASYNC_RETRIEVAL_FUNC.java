// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CANCEL_ASYNC_RETRIEVAL_FUNC {

    int apply(java.lang.foreign.MemoryAddress hAsyncRetrieve);
    static MemorySegment allocate(PFN_CANCEL_ASYNC_RETRIEVAL_FUNC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CANCEL_ASYNC_RETRIEVAL_FUNC.class, fi, constants$805.PFN_CANCEL_ASYNC_RETRIEVAL_FUNC$FUNC, session);
    }
    static PFN_CANCEL_ASYNC_RETRIEVAL_FUNC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hAsyncRetrieve) -> {
            try {
                return (int)constants$806.PFN_CANCEL_ASYNC_RETRIEVAL_FUNC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hAsyncRetrieve);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


