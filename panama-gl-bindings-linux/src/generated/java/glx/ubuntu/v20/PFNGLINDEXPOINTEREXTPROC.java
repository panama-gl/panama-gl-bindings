// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLINDEXPOINTEREXTPROC {

    void apply(int type, int stride, int count, java.lang.foreign.MemoryAddress pointer);
    static MemorySegment allocate(PFNGLINDEXPOINTEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLINDEXPOINTEREXTPROC.class, fi, constants$762.PFNGLINDEXPOINTEREXTPROC$FUNC, session);
    }
    static PFNGLINDEXPOINTEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _type, int _stride, int _count, java.lang.foreign.MemoryAddress _pointer) -> {
            try {
                constants$762.PFNGLINDEXPOINTEREXTPROC$MH.invokeExact((Addressable)symbol, _type, _stride, _count, (java.lang.foreign.Addressable)_pointer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


