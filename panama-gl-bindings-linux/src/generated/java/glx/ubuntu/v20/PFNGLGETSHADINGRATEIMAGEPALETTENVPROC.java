// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETSHADINGRATEIMAGEPALETTENVPROC {

    void apply(int viewport, int entry, java.lang.foreign.MemoryAddress rate);
    static MemorySegment allocate(PFNGLGETSHADINGRATEIMAGEPALETTENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETSHADINGRATEIMAGEPALETTENVPROC.class, fi, constants$909.PFNGLGETSHADINGRATEIMAGEPALETTENVPROC$FUNC, session);
    }
    static PFNGLGETSHADINGRATEIMAGEPALETTENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _viewport, int _entry, java.lang.foreign.MemoryAddress _rate) -> {
            try {
                constants$909.PFNGLGETSHADINGRATEIMAGEPALETTENVPROC$MH.invokeExact((Addressable)symbol, _viewport, _entry, (java.lang.foreign.Addressable)_rate);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

