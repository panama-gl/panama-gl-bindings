// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSEPARABLEFILTER2DEXTPROC {

    void apply(int target, int internalformat, int width, int height, int format, int type, java.lang.foreign.MemoryAddress row, java.lang.foreign.MemoryAddress column);
    static MemorySegment allocate(PFNGLSEPARABLEFILTER2DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSEPARABLEFILTER2DEXTPROC.class, fi, constants$609.PFNGLSEPARABLEFILTER2DEXTPROC$FUNC, session);
    }
    static PFNGLSEPARABLEFILTER2DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _internalformat, int _width, int _height, int _format, int _type, java.lang.foreign.MemoryAddress _row, java.lang.foreign.MemoryAddress _column) -> {
            try {
                constants$609.PFNGLSEPARABLEFILTER2DEXTPROC$MH.invokeExact((Addressable)symbol, _target, _internalformat, _width, _height, _format, _type, (java.lang.foreign.Addressable)_row, (java.lang.foreign.Addressable)_column);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


