// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDISABLECLIENTSTATEINDEXEDEXTPROC {

    void apply(int array, int index);
    static MemorySegment allocate(PFNGLDISABLECLIENTSTATEINDEXEDEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDISABLECLIENTSTATEINDEXEDEXTPROC.class, fi, constants$646.PFNGLDISABLECLIENTSTATEINDEXEDEXTPROC$FUNC, session);
    }
    static PFNGLDISABLECLIENTSTATEINDEXEDEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _array, int _index) -> {
            try {
                constants$646.PFNGLDISABLECLIENTSTATEINDEXEDEXTPROC$MH.invokeExact((Addressable)symbol, _array, _index);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


