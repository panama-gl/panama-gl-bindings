// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTPROC {

    void apply(int mode, int type, java.lang.foreign.MemoryAddress indirect, long drawcount, int maxdrawcount, int stride);
    static MemorySegment allocate(PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTPROC.class, fi, constants$397.PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTPROC$FUNC, session);
    }
    static PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, int _type, java.lang.foreign.MemoryAddress _indirect, long _drawcount, int _maxdrawcount, int _stride) -> {
            try {
                constants$397.PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTPROC$MH.invokeExact((Addressable)symbol, _mode, _type, (java.lang.foreign.Addressable)_indirect, _drawcount, _maxdrawcount, _stride);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


