// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCREATESHADERPROGRAMVPROC {

    int apply(int type, int count, java.lang.foreign.MemoryAddress strings);
    static MemorySegment allocate(PFNGLCREATESHADERPROGRAMVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCREATESHADERPROGRAMVPROC.class, fi, constants$222.PFNGLCREATESHADERPROGRAMVPROC$FUNC, session);
    }
    static PFNGLCREATESHADERPROGRAMVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _type, int _count, java.lang.foreign.MemoryAddress _strings) -> {
            try {
                return (int)constants$222.PFNGLCREATESHADERPROGRAMVPROC$MH.invokeExact((Addressable)symbol, _type, _count, (java.lang.foreign.Addressable)_strings);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


