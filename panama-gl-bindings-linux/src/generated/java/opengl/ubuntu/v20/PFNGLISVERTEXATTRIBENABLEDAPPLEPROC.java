// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLISVERTEXATTRIBENABLEDAPPLEPROC {

    byte apply(int index, int pname);
    static MemorySegment allocate(PFNGLISVERTEXATTRIBENABLEDAPPLEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLISVERTEXATTRIBENABLEDAPPLEPROC.class, fi, constants$484.PFNGLISVERTEXATTRIBENABLEDAPPLEPROC$FUNC, session);
    }
    static PFNGLISVERTEXATTRIBENABLEDAPPLEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _pname) -> {
            try {
                return (byte)constants$484.PFNGLISVERTEXATTRIBENABLEDAPPLEPROC$MH.invokeExact((Addressable)symbol, _index, _pname);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


