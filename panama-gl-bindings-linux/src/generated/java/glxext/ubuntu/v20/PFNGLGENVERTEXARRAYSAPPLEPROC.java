// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGENVERTEXARRAYSAPPLEPROC {

    void apply(int n, java.lang.foreign.MemoryAddress arrays);
    static MemorySegment allocate(PFNGLGENVERTEXARRAYSAPPLEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGENVERTEXARRAYSAPPLEPROC.class, fi, constants$567.PFNGLGENVERTEXARRAYSAPPLEPROC$FUNC, session);
    }
    static PFNGLGENVERTEXARRAYSAPPLEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _n, java.lang.foreign.MemoryAddress _arrays) -> {
            try {
                constants$567.PFNGLGENVERTEXARRAYSAPPLEPROC$MH.invokeExact((Addressable)symbol, _n, (java.lang.foreign.Addressable)_arrays);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

