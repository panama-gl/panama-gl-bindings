// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLTEXCOORDPOINTERVINTELPROC {

    void apply(int size, int type, java.lang.foreign.MemoryAddress pointer);
    static MemorySegment allocate(PFNGLTEXCOORDPOINTERVINTELPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORDPOINTERVINTELPROC.class, fi, constants$1014.PFNGLTEXCOORDPOINTERVINTELPROC$FUNC, session);
    }
    static PFNGLTEXCOORDPOINTERVINTELPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _size, int _type, java.lang.foreign.MemoryAddress _pointer) -> {
            try {
                constants$1014.PFNGLTEXCOORDPOINTERVINTELPROC$MH.invokeExact((Addressable)symbol, _size, _type, (java.lang.foreign.Addressable)_pointer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


