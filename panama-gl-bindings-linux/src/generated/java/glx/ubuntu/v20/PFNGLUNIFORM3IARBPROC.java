// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM3IARBPROC {

    void apply(int location, int v0, int v1, int v2);
    static MemorySegment allocate(PFNGLUNIFORM3IARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM3IARBPROC.class, fi, constants$448.PFNGLUNIFORM3IARBPROC$FUNC, session);
    }
    static PFNGLUNIFORM3IARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, int _v0, int _v1, int _v2) -> {
            try {
                constants$448.PFNGLUNIFORM3IARBPROC$MH.invokeExact((Addressable)symbol, _location, _v0, _v1, _v2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


