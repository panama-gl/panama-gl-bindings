// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC {

    void apply(int mode, int type, java.lang.foreign.MemoryAddress indirect, long drawcount, int maxdrawcount, int stride);
    static MemorySegment allocate(PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC.class, fi, constants$468.PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC$FUNC, session);
    }
    static PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, int _type, java.lang.foreign.MemoryAddress _indirect, long _drawcount, int _maxdrawcount, int _stride) -> {
            try {
                constants$468.PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC$MH.invokeExact((Addressable)symbol, _mode, _type, (java.lang.foreign.Addressable)_indirect, _drawcount, _maxdrawcount, _stride);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


