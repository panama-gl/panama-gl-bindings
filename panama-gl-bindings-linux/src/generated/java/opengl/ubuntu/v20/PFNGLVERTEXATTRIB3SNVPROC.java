// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIB3SNVPROC {

    void apply(int index, short x, short y, short z);
    static MemorySegment allocate(PFNGLVERTEXATTRIB3SNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB3SNVPROC.class, fi, constants$863.PFNGLVERTEXATTRIB3SNVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIB3SNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, short _x, short _y, short _z) -> {
            try {
                constants$863.PFNGLVERTEXATTRIB3SNVPROC$MH.invokeExact((Addressable)symbol, _index, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


