// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETPERFQUERYINFOINTELPROC {

    void apply(int queryId, int queryNameLength, java.lang.foreign.MemoryAddress queryName, java.lang.foreign.MemoryAddress dataSize, java.lang.foreign.MemoryAddress noCounters, java.lang.foreign.MemoryAddress noInstances, java.lang.foreign.MemoryAddress capsMask);
    static MemorySegment allocate(PFNGLGETPERFQUERYINFOINTELPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETPERFQUERYINFOINTELPROC.class, fi, constants$796.PFNGLGETPERFQUERYINFOINTELPROC$FUNC, session);
    }
    static PFNGLGETPERFQUERYINFOINTELPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _queryId, int _queryNameLength, java.lang.foreign.MemoryAddress _queryName, java.lang.foreign.MemoryAddress _dataSize, java.lang.foreign.MemoryAddress _noCounters, java.lang.foreign.MemoryAddress _noInstances, java.lang.foreign.MemoryAddress _capsMask) -> {
            try {
                constants$796.PFNGLGETPERFQUERYINFOINTELPROC$MH.invokeExact((Addressable)symbol, _queryId, _queryNameLength, (java.lang.foreign.Addressable)_queryName, (java.lang.foreign.Addressable)_dataSize, (java.lang.foreign.Addressable)_noCounters, (java.lang.foreign.Addressable)_noInstances, (java.lang.foreign.Addressable)_capsMask);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


