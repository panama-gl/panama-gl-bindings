// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFLUSHMAPPEDBUFFERRANGEPROC {

    void apply(int target, long offset, long length);
    static MemorySegment allocate(PFNGLFLUSHMAPPEDBUFFERRANGEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFLUSHMAPPEDBUFFERRANGEPROC.class, fi, constants$199.PFNGLFLUSHMAPPEDBUFFERRANGEPROC$FUNC, session);
    }
    static PFNGLFLUSHMAPPEDBUFFERRANGEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, long _offset, long _length) -> {
            try {
                constants$200.PFNGLFLUSHMAPPEDBUFFERRANGEPROC$MH.invokeExact((Addressable)symbol, _target, _offset, _length);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


