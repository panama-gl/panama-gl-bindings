// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORMHANDLEUI64ARBPROC {

    void apply(int location, long value);
    static MemorySegment allocate(PFNGLUNIFORMHANDLEUI64ARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORMHANDLEUI64ARBPROC.class, fi, constants$425.PFNGLUNIFORMHANDLEUI64ARBPROC$FUNC, session);
    }
    static PFNGLUNIFORMHANDLEUI64ARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, long _value) -> {
            try {
                constants$425.PFNGLUNIFORMHANDLEUI64ARBPROC$MH.invokeExact((Addressable)symbol, _location, _value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


