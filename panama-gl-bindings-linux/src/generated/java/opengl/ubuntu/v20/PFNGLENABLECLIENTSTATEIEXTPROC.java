// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLENABLECLIENTSTATEIEXTPROC {

    void apply(int array, int index);
    static MemorySegment allocate(PFNGLENABLECLIENTSTATEIEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLENABLECLIENTSTATEIEXTPROC.class, fi, constants$589.PFNGLENABLECLIENTSTATEIEXTPROC$FUNC, session);
    }
    static PFNGLENABLECLIENTSTATEIEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _array, int _index) -> {
            try {
                constants$589.PFNGLENABLECLIENTSTATEIEXTPROC$MH.invokeExact((Addressable)symbol, _array, _index);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


