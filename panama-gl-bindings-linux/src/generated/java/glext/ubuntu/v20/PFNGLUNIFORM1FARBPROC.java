// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUNIFORM1FARBPROC {

    void apply(int location, float v0);
    static MemorySegment allocate(PFNGLUNIFORM1FARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM1FARBPROC.class, fi, constants$361.PFNGLUNIFORM1FARBPROC$FUNC, session);
    }
    static PFNGLUNIFORM1FARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _location, float _v0) -> {
            try {
                constants$361.PFNGLUNIFORM1FARBPROC$MH.invokeExact((Addressable)symbol, _location, _v0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


