// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXQUERYRENDERERINTEGERMESAPROC {

    int apply(java.lang.foreign.MemoryAddress dpy, int screen, int renderer, int attribute, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLXQUERYRENDERERINTEGERMESAPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXQUERYRENDERERINTEGERMESAPROC.class, fi, constants$1036.PFNGLXQUERYRENDERERINTEGERMESAPROC$FUNC, session);
    }
    static PFNGLXQUERYRENDERERINTEGERMESAPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _dpy, int _screen, int _renderer, int _attribute, java.lang.foreign.MemoryAddress _value) -> {
            try {
                return (int)constants$1036.PFNGLXQUERYRENDERERINTEGERMESAPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_dpy, _screen, _renderer, _attribute, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


