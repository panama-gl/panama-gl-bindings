// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBFORMATNVPROC {

    void apply(int index, int size, int type, byte normalized, int stride);
    static MemorySegment allocate(PFNGLVERTEXATTRIBFORMATNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBFORMATNVPROC.class, fi, constants$934.PFNGLVERTEXATTRIBFORMATNVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBFORMATNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _size, int _type, byte _normalized, int _stride) -> {
            try {
                constants$934.PFNGLVERTEXATTRIBFORMATNVPROC$MH.invokeExact((Addressable)symbol, _index, _size, _type, _normalized, _stride);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


