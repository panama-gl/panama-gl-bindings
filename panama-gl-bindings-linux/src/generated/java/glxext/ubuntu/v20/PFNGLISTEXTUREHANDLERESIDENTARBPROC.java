// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISTEXTUREHANDLERESIDENTARBPROC {

    byte apply(long handle);
    static MemorySegment allocate(PFNGLISTEXTUREHANDLERESIDENTARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISTEXTUREHANDLERESIDENTARBPROC.class, fi, constants$401.PFNGLISTEXTUREHANDLERESIDENTARBPROC$FUNC, session);
    }
    static PFNGLISTEXTUREHANDLERESIDENTARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (long _handle) -> {
            try {
                return (byte)constants$401.PFNGLISTEXTUREHANDLERESIDENTARBPROC$MH.invokeExact((Addressable)symbol, _handle);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


