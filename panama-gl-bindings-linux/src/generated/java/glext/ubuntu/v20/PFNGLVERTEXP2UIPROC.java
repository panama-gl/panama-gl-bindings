// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXP2UIPROC {

    void apply(int type, int value);
    static MemorySegment allocate(PFNGLVERTEXP2UIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXP2UIPROC.class, fi, constants$240.PFNGLVERTEXP2UIPROC$FUNC, session);
    }
    static PFNGLVERTEXP2UIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _type, int _value) -> {
            try {
                constants$240.PFNGLVERTEXP2UIPROC$MH.invokeExact((Addressable)symbol, _type, _value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


