// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBP1UIPROC {

    void apply(int index, int type, byte normalized, int value);
    static MemorySegment allocate(PFNGLVERTEXATTRIBP1UIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBP1UIPROC.class, fi, constants$237.PFNGLVERTEXATTRIBP1UIPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBP1UIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _type, byte _normalized, int _value) -> {
            try {
                constants$237.PFNGLVERTEXATTRIBP1UIPROC$MH.invokeExact((Addressable)symbol, _index, _type, _normalized, _value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


