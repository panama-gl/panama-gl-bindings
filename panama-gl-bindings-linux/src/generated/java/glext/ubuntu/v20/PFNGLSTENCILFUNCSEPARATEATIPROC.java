// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSTENCILFUNCSEPARATEATIPROC {

    void apply(int frontfunc, int backfunc, int ref, int mask);
    static MemorySegment allocate(PFNGLSTENCILFUNCSEPARATEATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILFUNCSEPARATEATIPROC.class, fi, constants$696.PFNGLSTENCILFUNCSEPARATEATIPROC$FUNC, session);
    }
    static PFNGLSTENCILFUNCSEPARATEATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _frontfunc, int _backfunc, int _ref, int _mask) -> {
            try {
                constants$696.PFNGLSTENCILFUNCSEPARATEATIPROC$MH.invokeExact((Addressable)symbol, _frontfunc, _backfunc, _ref, _mask);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

