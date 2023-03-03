// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGENSYMBOLSEXTPROC {

    int apply(int datatype, int storagetype, int range, int components);
    static MemorySegment allocate(PFNGLGENSYMBOLSEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGENSYMBOLSEXTPROC.class, fi, constants$980.PFNGLGENSYMBOLSEXTPROC$FUNC, session);
    }
    static PFNGLGENSYMBOLSEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _datatype, int _storagetype, int _range, int _components) -> {
            try {
                return (int)constants$980.PFNGLGENSYMBOLSEXTPROC$MH.invokeExact((Addressable)symbol, _datatype, _storagetype, _range, _components);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

