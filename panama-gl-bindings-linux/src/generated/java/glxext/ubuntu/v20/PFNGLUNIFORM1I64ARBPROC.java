// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM1I64ARBPROC {

    void apply(int location, long x);
    static MemorySegment allocate(PFNGLUNIFORM1I64ARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM1I64ARBPROC.class, fi, constants$416.PFNGLUNIFORM1I64ARBPROC$FUNC, session);
    }
    static PFNGLUNIFORM1I64ARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, long _x) -> {
            try {
                constants$416.PFNGLUNIFORM1I64ARBPROC$MH.invokeExact((Addressable)symbol, _location, _x);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


