// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTITEXCOORDPOINTEREXTPROC {

    void apply(int texunit, int size, int type, int stride, java.lang.foreign.MemoryAddress pointer);
    static MemorySegment allocate(PFNGLMULTITEXCOORDPOINTEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORDPOINTEREXTPROC.class, fi, constants$770.PFNGLMULTITEXCOORDPOINTEREXTPROC$FUNC, session);
    }
    static PFNGLMULTITEXCOORDPOINTEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _texunit, int _size, int _type, int _stride, java.lang.foreign.MemoryAddress _pointer) -> {
            try {
                constants$770.PFNGLMULTITEXCOORDPOINTEREXTPROC$MH.invokeExact((Addressable)symbol, _texunit, _size, _type, _stride, (java.lang.foreign.Addressable)_pointer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


