// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXHYPERPIPECONFIGSGIXPROC {

    int apply(java.lang.foreign.MemoryAddress dpy, int networkId, int npipes, java.lang.foreign.MemoryAddress cfg, java.lang.foreign.MemoryAddress hpId);
    static MemorySegment allocate(PFNGLXHYPERPIPECONFIGSGIXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXHYPERPIPECONFIGSGIXPROC.class, fi, constants$1050.PFNGLXHYPERPIPECONFIGSGIXPROC$FUNC, session);
    }
    static PFNGLXHYPERPIPECONFIGSGIXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, int _networkId, int _npipes, java.lang.foreign.MemoryAddress _cfg, java.lang.foreign.MemoryAddress _hpId) -> {
            try {
                return (int)constants$1051.PFNGLXHYPERPIPECONFIGSGIXPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, _networkId, _npipes, (java.lang.foreign.Addressable)_cfg, (java.lang.foreign.Addressable)_hpId);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


