// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXPOINTERLISTIBMPROC {

    void apply(int size, int type, int stride, java.lang.foreign.MemoryAddress pointer, int ptrstride);
    static MemorySegment allocate(PFNGLVERTEXPOINTERLISTIBMPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXPOINTERLISTIBMPROC.class, fi, constants$789.PFNGLVERTEXPOINTERLISTIBMPROC$FUNC, session);
    }
    static PFNGLVERTEXPOINTERLISTIBMPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _size, int _type, int _stride, java.lang.foreign.MemoryAddress _pointer, int _ptrstride) -> {
            try {
                constants$789.PFNGLVERTEXPOINTERLISTIBMPROC$MH.invokeExact((Addressable)symbol, _size, _type, _stride, (java.lang.foreign.Addressable)_pointer, _ptrstride);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


