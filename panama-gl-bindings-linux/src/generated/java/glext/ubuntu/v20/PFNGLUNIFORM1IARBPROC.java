// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM1IARBPROC {

    void apply(int location, int v0);
    static MemorySegment allocate(PFNGLUNIFORM1IARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM1IARBPROC.class, fi, constants$495.PFNGLUNIFORM1IARBPROC$FUNC, session);
    }
    static PFNGLUNIFORM1IARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, int _v0) -> {
            try {
                constants$495.PFNGLUNIFORM1IARBPROC$MH.invokeExact((Addressable)symbol, _location, _v0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

