// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIB3SARBPROC {

    void apply(int index, short x, short y, short z);
    static MemorySegment allocate(PFNGLVERTEXATTRIB3SARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB3SARBPROC.class, fi, constants$475.PFNGLVERTEXATTRIB3SARBPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIB3SARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, short _x, short _y, short _z) -> {
            try {
                constants$475.PFNGLVERTEXATTRIB3SARBPROC$MH.invokeExact((Addressable)symbol, _index, _x, _y, _z);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


