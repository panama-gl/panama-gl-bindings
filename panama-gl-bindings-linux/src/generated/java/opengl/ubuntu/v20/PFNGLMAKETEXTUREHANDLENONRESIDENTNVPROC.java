// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMAKETEXTUREHANDLENONRESIDENTNVPROC {

    void apply(long handle);
    static MemorySegment allocate(PFNGLMAKETEXTUREHANDLENONRESIDENTNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMAKETEXTUREHANDLENONRESIDENTNVPROC.class, fi, constants$727.PFNGLMAKETEXTUREHANDLENONRESIDENTNVPROC$FUNC, session);
    }
    static PFNGLMAKETEXTUREHANDLENONRESIDENTNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (long _handle) -> {
            try {
                constants$727.PFNGLMAKETEXTUREHANDLENONRESIDENTNVPROC$MH.invokeExact((Addressable)symbol, _handle);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


