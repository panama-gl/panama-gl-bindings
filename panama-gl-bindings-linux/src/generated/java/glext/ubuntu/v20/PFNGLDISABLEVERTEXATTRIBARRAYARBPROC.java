// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDISABLEVERTEXATTRIBARRAYARBPROC {

    void apply(int index);
    static MemorySegment allocate(PFNGLDISABLEVERTEXATTRIBARRAYARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDISABLEVERTEXATTRIBARRAYARBPROC.class, fi, constants$397.PFNGLDISABLEVERTEXATTRIBARRAYARBPROC$FUNC, session);
    }
    static PFNGLDISABLEVERTEXATTRIBARRAYARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index) -> {
            try {
                constants$397.PFNGLDISABLEVERTEXATTRIBARRAYARBPROC$MH.invokeExact((Addressable)symbol, _index);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


