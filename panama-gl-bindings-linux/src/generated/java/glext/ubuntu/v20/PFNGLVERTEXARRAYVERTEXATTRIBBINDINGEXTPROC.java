// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC {

    void apply(int vaobj, int attribindex, int bindingindex);
    static MemorySegment allocate(PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC.class, fi, constants$840.PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC$FUNC, session);
    }
    static PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _vaobj, int _attribindex, int _bindingindex) -> {
            try {
                constants$841.PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC$MH.invokeExact((Addressable)symbol, _vaobj, _attribindex, _bindingindex);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


