// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLINDEXFORMATNVPROC {

    void apply(int type, int stride);
    static MemorySegment allocate(PFNGLINDEXFORMATNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLINDEXFORMATNVPROC.class, fi, constants$932.PFNGLINDEXFORMATNVPROC$FUNC, session);
    }
    static PFNGLINDEXFORMATNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _type, int _stride) -> {
            try {
                constants$932.PFNGLINDEXFORMATNVPROC$MH.invokeExact((Addressable)symbol, _type, _stride);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


