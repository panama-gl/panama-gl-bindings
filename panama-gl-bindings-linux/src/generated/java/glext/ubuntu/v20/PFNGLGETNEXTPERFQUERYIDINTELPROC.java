// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNEXTPERFQUERYIDINTELPROC {

    void apply(int queryId, java.lang.foreign.MemoryAddress nextQueryId);
    static MemorySegment allocate(PFNGLGETNEXTPERFQUERYIDINTELPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNEXTPERFQUERYIDINTELPROC.class, fi, constants$709.PFNGLGETNEXTPERFQUERYIDINTELPROC$FUNC, session);
    }
    static PFNGLGETNEXTPERFQUERYIDINTELPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _queryId, java.lang.foreign.MemoryAddress _nextQueryId) -> {
            try {
                constants$709.PFNGLGETNEXTPERFQUERYIDINTELPROC$MH.invokeExact((Addressable)symbol, _queryId, (java.lang.foreign.Addressable)_nextQueryId);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


