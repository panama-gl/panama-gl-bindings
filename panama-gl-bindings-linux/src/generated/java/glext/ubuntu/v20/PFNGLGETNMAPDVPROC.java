// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNMAPDVPROC {

    void apply(int target, int query, int bufSize, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLGETNMAPDVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNMAPDVPROC.class, fi, constants$306.PFNGLGETNMAPDVPROC$FUNC, session);
    }
    static PFNGLGETNMAPDVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _query, int _bufSize, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$306.PFNGLGETNMAPDVPROC$MH.invokeExact((Addressable)symbol, _target, _query, _bufSize, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


