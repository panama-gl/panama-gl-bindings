// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM4DPROC {

    void apply(int location, double x, double y, double z, double w);
    static MemorySegment allocate(PFNGLUNIFORM4DPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM4DPROC.class, fi, constants$207.PFNGLUNIFORM4DPROC$FUNC, session);
    }
    static PFNGLUNIFORM4DPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, double _x, double _y, double _z, double _w) -> {
            try {
                constants$207.PFNGLUNIFORM4DPROC$MH.invokeExact((Addressable)symbol, _location, _x, _y, _z, _w);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


