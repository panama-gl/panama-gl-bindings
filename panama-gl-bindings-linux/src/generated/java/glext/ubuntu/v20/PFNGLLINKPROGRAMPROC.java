// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLLINKPROGRAMPROC {

    void apply(int program);
    static MemorySegment allocate(PFNGLLINKPROGRAMPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLLINKPROGRAMPROC.class, fi, constants$124.PFNGLLINKPROGRAMPROC$FUNC, session);
    }
    static PFNGLLINKPROGRAMPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _program) -> {
            try {
                constants$124.PFNGLLINKPROGRAMPROC$MH.invokeExact((Addressable)symbol, _program);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


