// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTIDRAWARRAYSEXTPROC {

    void apply(int mode, java.lang.foreign.MemoryAddress first, java.lang.foreign.MemoryAddress count, int primcount);
    static MemorySegment allocate(PFNGLMULTIDRAWARRAYSEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWARRAYSEXTPROC.class, fi, constants$733.PFNGLMULTIDRAWARRAYSEXTPROC$FUNC, session);
    }
    static PFNGLMULTIDRAWARRAYSEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, java.lang.foreign.MemoryAddress _first, java.lang.foreign.MemoryAddress _count, int _primcount) -> {
            try {
                constants$733.PFNGLMULTIDRAWARRAYSEXTPROC$MH.invokeExact((Addressable)symbol, _mode, (java.lang.foreign.Addressable)_first, (java.lang.foreign.Addressable)_count, _primcount);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


