// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLARRAYOBJECTATIPROC {

    void apply(int array, int size, int type, int stride, int buffer, int offset);
    static MemorySegment allocate(PFNGLARRAYOBJECTATIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLARRAYOBJECTATIPROC.class, fi, constants$699.PFNGLARRAYOBJECTATIPROC$FUNC, session);
    }
    static PFNGLARRAYOBJECTATIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _array, int _size, int _type, int _stride, int _buffer, int _offset) -> {
            try {
                constants$699.PFNGLARRAYOBJECTATIPROC$MH.invokeExact((Addressable)symbol, _array, _size, _type, _stride, _buffer, _offset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


