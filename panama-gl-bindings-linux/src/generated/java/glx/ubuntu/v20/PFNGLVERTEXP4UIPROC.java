// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXP4UIPROC {

    void apply(int type, int value);
    static MemorySegment allocate(PFNGLVERTEXP4UIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXP4UIPROC.class, fi, constants$280.PFNGLVERTEXP4UIPROC$FUNC, session);
    }
    static PFNGLVERTEXP4UIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _type, int _value) -> {
            try {
                constants$280.PFNGLVERTEXP4UIPROC$MH.invokeExact((Addressable)symbol, _type, _value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


