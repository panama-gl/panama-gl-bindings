// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOLOR3XVOESPROC {

    void apply(java.lang.foreign.MemoryAddress components);
    static MemorySegment allocate(PFNGLCOLOR3XVOESPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOLOR3XVOESPROC.class, fi, constants$427.PFNGLCOLOR3XVOESPROC$FUNC, session);
    }
    static PFNGLCOLOR3XVOESPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _components) -> {
            try {
                constants$427.PFNGLCOLOR3XVOESPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_components);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


