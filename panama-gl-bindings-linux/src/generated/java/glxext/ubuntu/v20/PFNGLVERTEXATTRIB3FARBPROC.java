// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIB3FARBPROC {

    void apply(int index, float x, float y, float z);
    static MemorySegment allocate(PFNGLVERTEXATTRIB3FARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB3FARBPROC.class, fi, constants$475.PFNGLVERTEXATTRIB3FARBPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIB3FARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, float _x, float _y, float _z) -> {
            try {
                constants$475.PFNGLVERTEXATTRIB3FARBPROC$MH.invokeExact((Addressable)symbol, _index, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

