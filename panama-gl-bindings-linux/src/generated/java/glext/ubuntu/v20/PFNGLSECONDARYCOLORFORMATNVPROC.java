// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSECONDARYCOLORFORMATNVPROC {

    void apply(int size, int type, int stride);
    static MemorySegment allocate(PFNGLSECONDARYCOLORFORMATNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLORFORMATNVPROC.class, fi, constants$848.PFNGLSECONDARYCOLORFORMATNVPROC$FUNC, session);
    }
    static PFNGLSECONDARYCOLORFORMATNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _size, int _type, int _stride) -> {
            try {
                constants$848.PFNGLSECONDARYCOLORFORMATNVPROC$MH.invokeExact((Addressable)symbol, _size, _type, _stride);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


