// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETSTRINGIPROC {

    java.lang.foreign.Addressable apply(int name, int index);
    static MemorySegment allocate(PFNGLGETSTRINGIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETSTRINGIPROC.class, fi, constants$250.PFNGLGETSTRINGIPROC$FUNC, session);
    }
    static PFNGLGETSTRINGIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _name, int _index) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$250.PFNGLGETSTRINGIPROC$MH.invokeExact((Addressable)symbol, _name, _index);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

