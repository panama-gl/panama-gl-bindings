// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIB3FVPROC {

    void apply(int index, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLVERTEXATTRIB3FVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB3FVPROC.class, fi, constants$137.PFNGLVERTEXATTRIB3FVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIB3FVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$137.PFNGLVERTEXATTRIB3FVPROC$MH.invokeExact((Addressable)symbol, _index, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


