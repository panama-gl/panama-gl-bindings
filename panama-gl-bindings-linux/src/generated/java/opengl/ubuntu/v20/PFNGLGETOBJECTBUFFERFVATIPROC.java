// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETOBJECTBUFFERFVATIPROC {

    void apply(int buffer, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETOBJECTBUFFERFVATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETOBJECTBUFFERFVATIPROC.class, fi, constants$496.PFNGLGETOBJECTBUFFERFVATIPROC$FUNC, session);
    }
    static PFNGLGETOBJECTBUFFERFVATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _buffer, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$496.PFNGLGETOBJECTBUFFERFVATIPROC$MH.invokeExact((Addressable)symbol, _buffer, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


