// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFLUSHMAPPEDBUFFERRANGEAPPLEPROC {

    void apply(int target, long offset, long size);
    static MemorySegment allocate(PFNGLFLUSHMAPPEDBUFFERRANGEAPPLEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFLUSHMAPPEDBUFFERRANGEAPPLEPROC.class, fi, constants$565.PFNGLFLUSHMAPPEDBUFFERRANGEAPPLEPROC$FUNC, session);
    }
    static PFNGLFLUSHMAPPEDBUFFERRANGEAPPLEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, long _offset, long _size) -> {
            try {
                constants$565.PFNGLFLUSHMAPPEDBUFFERRANGEAPPLEPROC$MH.invokeExact((Addressable)symbol, _target, _offset, _size);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


