// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLXQUERYCURRENTRENDERERINTEGERMESAPROC {

    int apply(int attribute, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLXQUERYCURRENTRENDERERINTEGERMESAPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLXQUERYCURRENTRENDERERINTEGERMESAPROC.class, fi, constants$1035.PFNGLXQUERYCURRENTRENDERERINTEGERMESAPROC$FUNC, session);
    }
    static PFNGLXQUERYCURRENTRENDERERINTEGERMESAPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _attribute, java.lang.foreign.MemoryAddress _value) -> {
            try {
                return (int)constants$1035.PFNGLXQUERYCURRENTRENDERERINTEGERMESAPROC$MH.invokeExact((Addressable)symbol, _attribute, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

