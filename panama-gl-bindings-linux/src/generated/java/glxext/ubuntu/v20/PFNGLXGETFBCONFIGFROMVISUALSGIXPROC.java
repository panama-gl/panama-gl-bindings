// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXGETFBCONFIGFROMVISUALSGIXPROC {

    java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress dpy, java.lang.foreign.MemoryAddress vis);
    static MemorySegment allocate(PFNGLXGETFBCONFIGFROMVISUALSGIXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXGETFBCONFIGFROMVISUALSGIXPROC.class, fi, constants$1050.PFNGLXGETFBCONFIGFROMVISUALSGIXPROC$FUNC, session);
    }
    static PFNGLXGETFBCONFIGFROMVISUALSGIXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, java.lang.foreign.MemoryAddress _vis) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$1050.PFNGLXGETFBCONFIGFROMVISUALSGIXPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, (java.lang.foreign.Addressable)_vis);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

