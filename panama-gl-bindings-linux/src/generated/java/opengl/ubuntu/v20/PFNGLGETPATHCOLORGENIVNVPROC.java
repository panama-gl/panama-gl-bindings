// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETPATHCOLORGENIVNVPROC {

    void apply(int color, int pname, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLGETPATHCOLORGENIVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETPATHCOLORGENIVNVPROC.class, fi, constants$806.PFNGLGETPATHCOLORGENIVNVPROC$FUNC, session);
    }
    static PFNGLGETPATHCOLORGENIVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _color, int _pname, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$806.PFNGLGETPATHCOLORGENIVNVPROC$MH.invokeExact((Addressable)symbol, _color, _pname, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


