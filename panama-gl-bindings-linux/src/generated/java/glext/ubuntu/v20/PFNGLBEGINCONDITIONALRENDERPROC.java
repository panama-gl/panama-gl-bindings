// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBEGINCONDITIONALRENDERPROC {

    void apply(int id, int mode);
    static MemorySegment allocate(PFNGLBEGINCONDITIONALRENDERPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBEGINCONDITIONALRENDERPROC.class, fi, constants$150.PFNGLBEGINCONDITIONALRENDERPROC$FUNC, session);
    }
    static PFNGLBEGINCONDITIONALRENDERPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _id, int _mode) -> {
            try {
                constants$150.PFNGLBEGINCONDITIONALRENDERPROC$MH.invokeExact((Addressable)symbol, _id, _mode);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


