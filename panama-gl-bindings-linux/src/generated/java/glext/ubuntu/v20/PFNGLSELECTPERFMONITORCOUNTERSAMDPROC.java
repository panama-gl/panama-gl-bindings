// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSELECTPERFMONITORCOUNTERSAMDPROC {

    void apply(int monitor, byte enable, int group, int numCounters, java.lang.foreign.MemoryAddress counterList);
    static MemorySegment allocate(PFNGLSELECTPERFMONITORCOUNTERSAMDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSELECTPERFMONITORCOUNTERSAMDPROC.class, fi, constants$471.PFNGLSELECTPERFMONITORCOUNTERSAMDPROC$FUNC, session);
    }
    static PFNGLSELECTPERFMONITORCOUNTERSAMDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _monitor, byte _enable, int _group, int _numCounters, java.lang.foreign.MemoryAddress _counterList) -> {
            try {
                constants$471.PFNGLSELECTPERFMONITORCOUNTERSAMDPROC$MH.invokeExact((Addressable)symbol, _monitor, _enable, _group, _numCounters, (java.lang.foreign.Addressable)_counterList);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


