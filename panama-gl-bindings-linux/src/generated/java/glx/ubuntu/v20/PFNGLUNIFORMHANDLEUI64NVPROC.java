// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORMHANDLEUI64NVPROC {

    void apply(int location, long value);
    static MemorySegment allocate(PFNGLUNIFORMHANDLEUI64NVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORMHANDLEUI64NVPROC.class, fi, constants$814.PFNGLUNIFORMHANDLEUI64NVPROC$FUNC, session);
    }
    static PFNGLUNIFORMHANDLEUI64NVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, long _value) -> {
            try {
                constants$814.PFNGLUNIFORMHANDLEUI64NVPROC$MH.invokeExact((Addressable)symbol, _location, _value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


