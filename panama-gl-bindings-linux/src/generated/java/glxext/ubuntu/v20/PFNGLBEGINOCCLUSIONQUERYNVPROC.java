// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBEGINOCCLUSIONQUERYNVPROC {

    void apply(int id);
    static MemorySegment allocate(PFNGLBEGINOCCLUSIONQUERYNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBEGINOCCLUSIONQUERYNVPROC.class, fi, constants$869.PFNGLBEGINOCCLUSIONQUERYNVPROC$FUNC, session);
    }
    static PFNGLBEGINOCCLUSIONQUERYNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id) -> {
            try {
                constants$869.PFNGLBEGINOCCLUSIONQUERYNVPROC$MH.invokeExact((Addressable)symbol, _id);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


