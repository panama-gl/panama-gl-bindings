// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETATTRIBLOCATIONARBPROC {

    int apply(int programObj, java.lang.foreign.MemoryAddress name);
    static MemorySegment allocate(PFNGLGETATTRIBLOCATIONARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETATTRIBLOCATIONARBPROC.class, fi, constants$553.PFNGLGETATTRIBLOCATIONARBPROC$FUNC, session);
    }
    static PFNGLGETATTRIBLOCATIONARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _programObj, java.lang.foreign.MemoryAddress _name) -> {
            try {
                return (int)constants$553.PFNGLGETATTRIBLOCATIONARBPROC$MH.invokeExact((Addressable)symbol, _programObj, (java.lang.foreign.Addressable)_name);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

