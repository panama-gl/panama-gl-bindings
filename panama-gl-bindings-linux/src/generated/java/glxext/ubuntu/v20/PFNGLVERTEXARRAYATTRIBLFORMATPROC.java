// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXARRAYATTRIBLFORMATPROC {

    void apply(int vaobj, int attribindex, int size, int type, int relativeoffset);
    static MemorySegment allocate(PFNGLVERTEXARRAYATTRIBLFORMATPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYATTRIBLFORMATPROC.class, fi, constants$384.PFNGLVERTEXARRAYATTRIBLFORMATPROC$FUNC, session);
    }
    static PFNGLVERTEXARRAYATTRIBLFORMATPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _vaobj, int _attribindex, int _size, int _type, int _relativeoffset) -> {
            try {
                constants$384.PFNGLVERTEXARRAYATTRIBLFORMATPROC$MH.invokeExact((Addressable)symbol, _vaobj, _attribindex, _size, _type, _relativeoffset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


