// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMAPBUFFERARBPROC {

    java.lang.foreign.Addressable apply(int target, int access);
    static MemorySegment allocate(PFNGLMAPBUFFERARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMAPBUFFERARBPROC.class, fi, constants$383.PFNGLMAPBUFFERARBPROC$FUNC, session);
    }
    static PFNGLMAPBUFFERARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _access) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$383.PFNGLMAPBUFFERARBPROC$MH.invokeExact((Addressable)symbol, _target, _access);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


