// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM2DPROC {

    void apply(int location, double x, double y);
    static MemorySegment allocate(PFNGLUNIFORM2DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM2DPROC.class, fi, constants$262.PFNGLUNIFORM2DPROC$FUNC, session);
    }
    static PFNGLUNIFORM2DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, double _x, double _y) -> {
            try {
                constants$262.PFNGLUNIFORM2DPROC$MH.invokeExact((Addressable)symbol, _location, _x, _y);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


