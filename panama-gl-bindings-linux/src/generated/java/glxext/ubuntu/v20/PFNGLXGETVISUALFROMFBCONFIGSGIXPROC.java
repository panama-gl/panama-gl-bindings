// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXGETVISUALFROMFBCONFIGSGIXPROC {

    java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress dpy, java.lang.foreign.MemoryAddress config);
    static MemorySegment allocate(PFNGLXGETVISUALFROMFBCONFIGSGIXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXGETVISUALFROMFBCONFIGSGIXPROC.class, fi, constants$1049.PFNGLXGETVISUALFROMFBCONFIGSGIXPROC$FUNC, session);
    }
    static PFNGLXGETVISUALFROMFBCONFIGSGIXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, java.lang.foreign.MemoryAddress _config) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$1050.PFNGLXGETVISUALFROMFBCONFIGSGIXPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, (java.lang.foreign.Addressable)_config);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


