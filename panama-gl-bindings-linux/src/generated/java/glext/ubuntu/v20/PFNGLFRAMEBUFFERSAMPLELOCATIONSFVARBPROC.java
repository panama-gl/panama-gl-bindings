// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC {

    void apply(int target, int start, int count, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC.class, fi, constants$488.PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC$FUNC, session);
    }
    static PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _start, int _count, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$488.PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC$MH.invokeExact((Addressable)symbol, _target, _start, _count, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


