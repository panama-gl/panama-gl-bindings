// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIB1HNVPROC {

    void apply(int index, short x);
    static MemorySegment allocate(PFNGLVERTEXATTRIB1HNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB1HNVPROC.class, fi, constants$860.PFNGLVERTEXATTRIB1HNVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIB1HNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, short _x) -> {
            try {
                constants$860.PFNGLVERTEXATTRIB1HNVPROC$MH.invokeExact((Addressable)symbol, _index, _x);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


