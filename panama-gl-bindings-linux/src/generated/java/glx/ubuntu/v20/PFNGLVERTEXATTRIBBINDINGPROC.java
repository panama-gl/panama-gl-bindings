// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBBINDINGPROC {

    void apply(int attribindex, int bindingindex);
    static MemorySegment allocate(PFNGLVERTEXATTRIBBINDINGPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBBINDINGPROC.class, fi, constants$348.PFNGLVERTEXATTRIBBINDINGPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBBINDINGPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _attribindex, int _bindingindex) -> {
            try {
                constants$348.PFNGLVERTEXATTRIBBINDINGPROC$MH.invokeExact((Addressable)symbol, _attribindex, _bindingindex);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


