// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGENNAMESAMDPROC {

    void apply(int identifier, int num, java.lang.foreign.MemoryAddress names);
    static MemorySegment allocate(PFNGLGENNAMESAMDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGENNAMESAMDPROC.class, fi, constants$468.PFNGLGENNAMESAMDPROC$FUNC, session);
    }
    static PFNGLGENNAMESAMDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _identifier, int _num, java.lang.foreign.MemoryAddress _names) -> {
            try {
                constants$468.PFNGLGENNAMESAMDPROC$MH.invokeExact((Addressable)symbol, _identifier, _num, (java.lang.foreign.Addressable)_names);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


