// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETTEXFILTERFUNCSGISPROC {

    void apply(int target, int filter, java.lang.foreign.MemoryAddress weights);
    static MemorySegment allocate(PFNGLGETTEXFILTERFUNCSGISPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXFILTERFUNCSGISPROC.class, fi, constants$975.PFNGLGETTEXFILTERFUNCSGISPROC$FUNC, session);
    }
    static PFNGLGETTEXFILTERFUNCSGISPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _filter, java.lang.foreign.MemoryAddress _weights) -> {
            try {
                constants$975.PFNGLGETTEXFILTERFUNCSGISPROC$MH.invokeExact((Addressable)symbol, _target, _filter, (java.lang.foreign.Addressable)_weights);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


