// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLUSESHADERPROGRAMEXTPROC {

    void apply(int type, int program);
    static MemorySegment allocate(PFNGLUSESHADERPROGRAMEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLUSESHADERPROGRAMEXTPROC.class, fi, constants$949.PFNGLUSESHADERPROGRAMEXTPROC$FUNC, session);
    }
    static PFNGLUSESHADERPROGRAMEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _type, int _program) -> {
            try {
                constants$949.PFNGLUSESHADERPROGRAMEXTPROC$MH.invokeExact((Addressable)symbol, _type, _program);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

