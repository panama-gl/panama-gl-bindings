// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTIDRAWARRAYSINDIRECTCOUNTARBPROC {

    void apply(int mode, java.lang.foreign.MemoryAddress indirect, long drawcount, int maxdrawcount, int stride);
    static MemorySegment allocate(PFNGLMULTIDRAWARRAYSINDIRECTCOUNTARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWARRAYSINDIRECTCOUNTARBPROC.class, fi, constants$428.PFNGLMULTIDRAWARRAYSINDIRECTCOUNTARBPROC$FUNC, session);
    }
    static PFNGLMULTIDRAWARRAYSINDIRECTCOUNTARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, java.lang.foreign.MemoryAddress _indirect, long _drawcount, int _maxdrawcount, int _stride) -> {
            try {
                constants$428.PFNGLMULTIDRAWARRAYSINDIRECTCOUNTARBPROC$MH.invokeExact((Addressable)symbol, _mode, (java.lang.foreign.Addressable)_indirect, _drawcount, _maxdrawcount, _stride);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


