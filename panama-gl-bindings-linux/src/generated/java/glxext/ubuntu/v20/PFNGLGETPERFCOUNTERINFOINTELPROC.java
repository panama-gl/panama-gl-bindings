// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETPERFCOUNTERINFOINTELPROC {

    void apply(int queryId, int counterId, int counterNameLength, java.lang.foreign.MemoryAddress counterName, int counterDescLength, java.lang.foreign.MemoryAddress counterDesc, java.lang.foreign.MemoryAddress counterOffset, java.lang.foreign.MemoryAddress counterDataSize, java.lang.foreign.MemoryAddress counterTypeEnum, java.lang.foreign.MemoryAddress counterDataTypeEnum, java.lang.foreign.MemoryAddress rawCounterMaxValue);
    static MemorySegment allocate(PFNGLGETPERFCOUNTERINFOINTELPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETPERFCOUNTERINFOINTELPROC.class, fi, constants$795.PFNGLGETPERFCOUNTERINFOINTELPROC$FUNC, session);
    }
    static PFNGLGETPERFCOUNTERINFOINTELPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _queryId, int _counterId, int _counterNameLength, java.lang.foreign.MemoryAddress _counterName, int _counterDescLength, java.lang.foreign.MemoryAddress _counterDesc, java.lang.foreign.MemoryAddress _counterOffset, java.lang.foreign.MemoryAddress _counterDataSize, java.lang.foreign.MemoryAddress _counterTypeEnum, java.lang.foreign.MemoryAddress _counterDataTypeEnum, java.lang.foreign.MemoryAddress _rawCounterMaxValue) -> {
            try {
                constants$795.PFNGLGETPERFCOUNTERINFOINTELPROC$MH.invokeExact((Addressable)symbol, _queryId, _counterId, _counterNameLength, (java.lang.foreign.Addressable)_counterName, _counterDescLength, (java.lang.foreign.Addressable)_counterDesc, (java.lang.foreign.Addressable)_counterOffset, (java.lang.foreign.Addressable)_counterDataSize, (java.lang.foreign.Addressable)_counterTypeEnum, (java.lang.foreign.Addressable)_counterDataTypeEnum, (java.lang.foreign.Addressable)_rawCounterMaxValue);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

