// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTESSELLATIONMODEAMDPROC {

    void apply(int mode);
    static MemorySegment allocate(PFNGLTESSELLATIONMODEAMDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTESSELLATIONMODEAMDPROC.class, fi, constants$665.PFNGLTESSELLATIONMODEAMDPROC$FUNC, session);
    }
    static PFNGLTESSELLATIONMODEAMDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode) -> {
            try {
                constants$665.PFNGLTESSELLATIONMODEAMDPROC$MH.invokeExact((Addressable)symbol, _mode);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


