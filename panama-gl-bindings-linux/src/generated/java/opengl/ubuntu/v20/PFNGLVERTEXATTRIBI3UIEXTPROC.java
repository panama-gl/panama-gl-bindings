// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBI3UIEXTPROC {

    void apply(int index, int x, int y, int z);
    static MemorySegment allocate(PFNGLVERTEXATTRIBI3UIEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI3UIEXTPROC.class, fi, constants$873.PFNGLVERTEXATTRIBI3UIEXTPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBI3UIEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _x, int _y, int _z) -> {
            try {
                constants$873.PFNGLVERTEXATTRIBI3UIEXTPROC$MH.invokeExact((Addressable)symbol, _index, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


