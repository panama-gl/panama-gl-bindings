// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLAPPLYTEXTUREEXTPROC {

    void apply(int mode);
    static MemorySegment allocate(PFNGLAPPLYTEXTUREEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLAPPLYTEXTUREEXTPROC.class, fi, constants$639.PFNGLAPPLYTEXTUREEXTPROC$FUNC, session);
    }
    static PFNGLAPPLYTEXTUREEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode) -> {
            try {
                constants$639.PFNGLAPPLYTEXTUREEXTPROC$MH.invokeExact((Addressable)symbol, _mode);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


