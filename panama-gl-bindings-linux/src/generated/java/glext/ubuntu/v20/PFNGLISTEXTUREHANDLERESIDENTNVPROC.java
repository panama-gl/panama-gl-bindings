// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISTEXTUREHANDLERESIDENTNVPROC {

    byte apply(long handle);
    static MemorySegment allocate(PFNGLISTEXTUREHANDLERESIDENTNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISTEXTUREHANDLERESIDENTNVPROC.class, fi, constants$1047.PFNGLISTEXTUREHANDLERESIDENTNVPROC$FUNC, session);
    }
    static PFNGLISTEXTUREHANDLERESIDENTNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (long _handle) -> {
            try {
                return (byte)constants$1047.PFNGLISTEXTUREHANDLERESIDENTNVPROC$MH.invokeExact((Addressable)symbol, _handle);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


