// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLATTACHOBJECTARBPROC {

    void apply(int containerObj, int obj);
    static MemorySegment allocate(PFNGLATTACHOBJECTARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLATTACHOBJECTARBPROC.class, fi, constants$492.PFNGLATTACHOBJECTARBPROC$FUNC, session);
    }
    static PFNGLATTACHOBJECTARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _containerObj, int _obj) -> {
            try {
                constants$492.PFNGLATTACHOBJECTARBPROC$MH.invokeExact((Addressable)symbol, _containerObj, _obj);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


