// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXGETFBCONFIGATTRIBSGIXPROC {

    int apply(java.lang.foreign.MemoryAddress dpy, java.lang.foreign.MemoryAddress config, int attribute, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLXGETFBCONFIGATTRIBSGIXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXGETFBCONFIGATTRIBSGIXPROC.class, fi, constants$1048.PFNGLXGETFBCONFIGATTRIBSGIXPROC$FUNC, session);
    }
    static PFNGLXGETFBCONFIGATTRIBSGIXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, java.lang.foreign.MemoryAddress _config, int _attribute, java.lang.foreign.MemoryAddress _value) -> {
            try {
                return (int)constants$1048.PFNGLXGETFBCONFIGATTRIBSGIXPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, (java.lang.foreign.Addressable)_config, _attribute, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

