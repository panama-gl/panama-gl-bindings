// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBP3UIPROC {

    void apply(int index, int type, byte normalized, int value);
    static MemorySegment allocate(PFNGLVERTEXATTRIBP3UIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBP3UIPROC.class, fi, constants$278.PFNGLVERTEXATTRIBP3UIPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBP3UIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _type, byte _normalized, int _value) -> {
            try {
                constants$278.PFNGLVERTEXATTRIBP3UIPROC$MH.invokeExact((Addressable)symbol, _index, _type, _normalized, _value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


