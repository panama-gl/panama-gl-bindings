// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSHADINGRATEIMAGEPALETTENVPROC {

    void apply(int viewport, int first, int count, java.lang.foreign.MemoryAddress rates);
    static MemorySegment allocate(PFNGLSHADINGRATEIMAGEPALETTENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSHADINGRATEIMAGEPALETTENVPROC.class, fi, constants$910.PFNGLSHADINGRATEIMAGEPALETTENVPROC$FUNC, session);
    }
    static PFNGLSHADINGRATEIMAGEPALETTENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _viewport, int _first, int _count, java.lang.foreign.MemoryAddress _rates) -> {
            try {
                constants$910.PFNGLSHADINGRATEIMAGEPALETTENVPROC$MH.invokeExact((Addressable)symbol, _viewport, _first, _count, (java.lang.foreign.Addressable)_rates);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


