// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETVERTEXATTRIBLDVPROC {

    void apply(int index, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETVERTEXATTRIBLDVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETVERTEXATTRIBLDVPROC.class, fi, constants$330.PFNGLGETVERTEXATTRIBLDVPROC$FUNC, session);
    }
    static PFNGLGETVERTEXATTRIBLDVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$330.PFNGLGETVERTEXATTRIBLDVPROC$MH.invokeExact((Addressable)symbol, _index, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


