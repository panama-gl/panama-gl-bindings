// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLINDEXFUNCEXTPROC {

    void apply(int func, float ref);
    static MemorySegment allocate(PFNGLINDEXFUNCEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLINDEXFUNCEXTPROC.class, fi, constants$724.PFNGLINDEXFUNCEXTPROC$FUNC, session);
    }
    static PFNGLINDEXFUNCEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _func, float _ref) -> {
            try {
                constants$724.PFNGLINDEXFUNCEXTPROC$MH.invokeExact((Addressable)symbol, _func, _ref);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

