// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM1FPROC {

    void apply(int location, float v0);
    static MemorySegment allocate(PFNGLUNIFORM1FPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM1FPROC.class, fi, constants$210.PFNGLUNIFORM1FPROC$FUNC, session);
    }
    static PFNGLUNIFORM1FPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, float _v0) -> {
            try {
                constants$210.PFNGLUNIFORM1FPROC$MH.invokeExact((Addressable)symbol, _location, _v0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

