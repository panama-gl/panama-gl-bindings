// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGENRENDERBUFFERSPROC {

    void apply(int n, java.lang.foreign.MemoryAddress renderbuffers);
    static MemorySegment allocate(PFNGLGENRENDERBUFFERSPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGENRENDERBUFFERSPROC.class, fi, constants$166.PFNGLGENRENDERBUFFERSPROC$FUNC, session);
    }
    static PFNGLGENRENDERBUFFERSPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, java.lang.foreign.MemoryAddress _renderbuffers) -> {
            try {
                constants$166.PFNGLGENRENDERBUFFERSPROC$MH.invokeExact((Addressable)symbol, _n, (java.lang.foreign.Addressable)_renderbuffers);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


