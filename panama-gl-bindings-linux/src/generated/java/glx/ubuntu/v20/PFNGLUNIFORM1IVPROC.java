// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM1IVPROC {

    void apply(int location, int count, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLUNIFORM1IVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM1IVPROC.class, fi, constants$214.PFNGLUNIFORM1IVPROC$FUNC, session);
    }
    static PFNGLUNIFORM1IVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, int _count, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$214.PFNGLUNIFORM1IVPROC$MH.invokeExact((Addressable)symbol, _location, _count, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


