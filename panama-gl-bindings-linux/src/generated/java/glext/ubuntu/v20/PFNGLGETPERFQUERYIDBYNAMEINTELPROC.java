// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETPERFQUERYIDBYNAMEINTELPROC {

    void apply(java.lang.foreign.MemoryAddress queryName, java.lang.foreign.MemoryAddress queryId);
    static MemorySegment allocate(PFNGLGETPERFQUERYIDBYNAMEINTELPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETPERFQUERYIDBYNAMEINTELPROC.class, fi, constants$1017.PFNGLGETPERFQUERYIDBYNAMEINTELPROC$FUNC, session);
    }
    static PFNGLGETPERFQUERYIDBYNAMEINTELPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _queryName, java.lang.foreign.MemoryAddress _queryId) -> {
            try {
                constants$1017.PFNGLGETPERFQUERYIDBYNAMEINTELPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_queryName, (java.lang.foreign.Addressable)_queryId);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


