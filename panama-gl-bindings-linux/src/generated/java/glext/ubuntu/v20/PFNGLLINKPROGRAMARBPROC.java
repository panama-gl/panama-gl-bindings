// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLLINKPROGRAMARBPROC {

    void apply(int programObj);
    static MemorySegment allocate(PFNGLLINKPROGRAMARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLLINKPROGRAMARBPROC.class, fi, constants$492.PFNGLLINKPROGRAMARBPROC$FUNC, session);
    }
    static PFNGLLINKPROGRAMARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _programObj) -> {
            try {
                constants$493.PFNGLLINKPROGRAMARBPROC$MH.invokeExact((Addressable)symbol, _programObj);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


