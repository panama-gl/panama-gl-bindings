// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBP4UIVPROC {

    void apply(int index, int type, byte normalized, java.lang.foreign.MemoryAddress value);
    static MemorySegment allocate(PFNGLVERTEXATTRIBP4UIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBP4UIVPROC.class, fi, constants$279.PFNGLVERTEXATTRIBP4UIVPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBP4UIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _type, byte _normalized, java.lang.foreign.MemoryAddress _value) -> {
            try {
                constants$279.PFNGLVERTEXATTRIBP4UIVPROC$MH.invokeExact((Addressable)symbol, _index, _type, _normalized, (java.lang.foreign.Addressable)_value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


