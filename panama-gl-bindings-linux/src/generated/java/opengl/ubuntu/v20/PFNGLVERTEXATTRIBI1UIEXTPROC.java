// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBI1UIEXTPROC {

    void apply(int index, int x);
    static MemorySegment allocate(PFNGLVERTEXATTRIBI1UIEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI1UIEXTPROC.class, fi, constants$872.PFNGLVERTEXATTRIBI1UIEXTPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBI1UIEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _x) -> {
            try {
                constants$872.PFNGLVERTEXATTRIBI1UIEXTPROC$MH.invokeExact((Addressable)symbol, _index, _x);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


