// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC {

    void apply(int vaobj, int attribindex, int size, int type, int relativeoffset);
    static MemorySegment allocate(PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC.class, fi, constants$704.PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC$FUNC, session);
    }
    static PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _vaobj, int _attribindex, int _size, int _type, int _relativeoffset) -> {
            try {
                constants$704.PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC$MH.invokeExact((Addressable)symbol, _vaobj, _attribindex, _size, _type, _relativeoffset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


