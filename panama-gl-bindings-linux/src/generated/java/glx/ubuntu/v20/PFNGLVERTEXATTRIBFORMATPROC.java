// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBFORMATPROC {

    void apply(int attribindex, int size, int type, byte normalized, int relativeoffset);
    static MemorySegment allocate(PFNGLVERTEXATTRIBFORMATPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBFORMATPROC.class, fi, constants$347.PFNGLVERTEXATTRIBFORMATPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBFORMATPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _attribindex, int _size, int _type, byte _normalized, int _relativeoffset) -> {
            try {
                constants$347.PFNGLVERTEXATTRIBFORMATPROC$MH.invokeExact((Addressable)symbol, _attribindex, _size, _type, _normalized, _relativeoffset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


