// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBI1IVPROC {

    void apply(int index, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLVERTEXATTRIBI1IVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI1IVPROC.class, fi, constants$240.PFNGLVERTEXATTRIBI1IVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBI1IVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$240.PFNGLVERTEXATTRIBI1IVPROC$MH.invokeExact((Addressable)symbol, _index, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


