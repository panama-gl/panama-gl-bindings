// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMAKEIMAGEHANDLERESIDENTARBPROC {

    void apply(long handle, int access);
    static MemorySegment allocate(PFNGLMAKEIMAGEHANDLERESIDENTARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMAKEIMAGEHANDLERESIDENTARBPROC.class, fi, constants$314.PFNGLMAKEIMAGEHANDLERESIDENTARBPROC$FUNC, session);
    }
    static PFNGLMAKEIMAGEHANDLERESIDENTARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (long _handle, int _access) -> {
            try {
                constants$314.PFNGLMAKEIMAGEHANDLERESIDENTARBPROC$MH.invokeExact((Addressable)symbol, _handle, _access);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


