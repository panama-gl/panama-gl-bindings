// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXARRAYVERTEXATTRIBFORMATEXTPROC {

    void apply(int vaobj, int attribindex, int size, int type, byte normalized, int relativeoffset);
    static MemorySegment allocate(PFNGLVERTEXARRAYVERTEXATTRIBFORMATEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYVERTEXATTRIBFORMATEXTPROC.class, fi, constants$703.PFNGLVERTEXARRAYVERTEXATTRIBFORMATEXTPROC$FUNC, session);
    }
    static PFNGLVERTEXARRAYVERTEXATTRIBFORMATEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _vaobj, int _attribindex, int _size, int _type, byte _normalized, int _relativeoffset) -> {
            try {
                constants$703.PFNGLVERTEXARRAYVERTEXATTRIBFORMATEXTPROC$MH.invokeExact((Addressable)symbol, _vaobj, _attribindex, _size, _type, _normalized, _relativeoffset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

