// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETVERTEXATTRIBFVARBPROC {

    void apply(int index, int pname, java.lang.foreign.MemoryAddress params);
    static MemorySegment allocate(PFNGLGETVERTEXATTRIBFVARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETVERTEXATTRIBFVARBPROC.class, fi, constants$544.PFNGLGETVERTEXATTRIBFVARBPROC$FUNC, session);
    }
    static PFNGLGETVERTEXATTRIBFVARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _pname, java.lang.foreign.MemoryAddress _params) -> {
            try {
                constants$544.PFNGLGETVERTEXATTRIBFVARBPROC$MH.invokeExact((Addressable)symbol, _index, _pname, (java.lang.foreign.Addressable)_params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


