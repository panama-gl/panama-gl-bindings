// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLEDGEFLAGPOINTEREXTPROC {

    void apply(int stride, int count, java.lang.foreign.MemoryAddress pointer);
    static MemorySegment allocate(PFNGLEDGEFLAGPOINTEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLEDGEFLAGPOINTEREXTPROC.class, fi, constants$968.PFNGLEDGEFLAGPOINTEREXTPROC$FUNC, session);
    }
    static PFNGLEDGEFLAGPOINTEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _stride, int _count, java.lang.foreign.MemoryAddress _pointer) -> {
            try {
                constants$968.PFNGLEDGEFLAGPOINTEREXTPROC$MH.invokeExact((Addressable)symbol, _stride, _count, (java.lang.foreign.Addressable)_pointer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


