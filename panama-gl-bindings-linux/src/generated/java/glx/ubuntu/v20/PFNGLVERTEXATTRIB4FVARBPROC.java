// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIB4FVARBPROC {

    void apply(int index, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLVERTEXATTRIB4FVARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB4FVARBPROC.class, fi, constants$480.PFNGLVERTEXATTRIB4FVARBPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIB4FVARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$480.PFNGLVERTEXATTRIB4FVARBPROC$MH.invokeExact((Addressable)symbol, _index, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


