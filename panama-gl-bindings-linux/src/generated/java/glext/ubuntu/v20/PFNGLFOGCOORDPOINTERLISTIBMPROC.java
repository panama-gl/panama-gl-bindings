// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLFOGCOORDPOINTERLISTIBMPROC {

    void apply(int type, int stride, java.lang.foreign.MemoryAddress pointer, int ptrstride);
    static MemorySegment allocate(PFNGLFOGCOORDPOINTERLISTIBMPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLFOGCOORDPOINTERLISTIBMPROC.class, fi, constants$703.PFNGLFOGCOORDPOINTERLISTIBMPROC$FUNC, session);
    }
    static PFNGLFOGCOORDPOINTERLISTIBMPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _type, int _stride, java.lang.foreign.MemoryAddress _pointer, int _ptrstride) -> {
            try {
                constants$703.PFNGLFOGCOORDPOINTERLISTIBMPROC$MH.invokeExact((Addressable)symbol, _type, _stride, (java.lang.foreign.Addressable)_pointer, _ptrstride);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


