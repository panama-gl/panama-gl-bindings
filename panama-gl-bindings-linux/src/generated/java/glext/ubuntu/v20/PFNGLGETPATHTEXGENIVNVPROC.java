// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETPATHTEXGENIVNVPROC {

    void apply(int texCoordSet, int pname, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLGETPATHTEXGENIVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETPATHTEXGENIVNVPROC.class, fi, constants$807.PFNGLGETPATHTEXGENIVNVPROC$FUNC, session);
    }
    static PFNGLGETPATHTEXGENIVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texCoordSet, int _pname, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$807.PFNGLGETPATHTEXGENIVNVPROC$MH.invokeExact((Addressable)symbol, _texCoordSet, _pname, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


