// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNAMEDBUFFERATTACHMEMORYNVPROC {

    void apply(int buffer, int memory, long offset);
    static MemorySegment allocate(PFNGLNAMEDBUFFERATTACHMEMORYNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDBUFFERATTACHMEMORYNVPROC.class, fi, constants$781.PFNGLNAMEDBUFFERATTACHMEMORYNVPROC$FUNC, session);
    }
    static PFNGLNAMEDBUFFERATTACHMEMORYNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _buffer, int _memory, long _offset) -> {
            try {
                constants$781.PFNGLNAMEDBUFFERATTACHMEMORYNVPROC$MH.invokeExact((Addressable)symbol, _buffer, _memory, _offset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


