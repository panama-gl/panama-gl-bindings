// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETQUERYINDEXEDIVPROC {

    void apply(int target, int index, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETQUERYINDEXEDIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETQUERYINDEXEDIVPROC.class, fi, constants$219.PFNGLGETQUERYINDEXEDIVPROC$FUNC, session);
    }
    static PFNGLGETQUERYINDEXEDIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _index, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$219.PFNGLGETQUERYINDEXEDIVPROC$MH.invokeExact((Addressable)symbol, _target, _index, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


