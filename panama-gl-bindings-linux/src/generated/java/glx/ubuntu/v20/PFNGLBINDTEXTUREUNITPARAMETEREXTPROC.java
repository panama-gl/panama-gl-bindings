// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINDTEXTUREUNITPARAMETEREXTPROC {

    int apply(int unit, int value);
    static MemorySegment allocate(PFNGLBINDTEXTUREUNITPARAMETEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINDTEXTUREUNITPARAMETEREXTPROC.class, fi, constants$777.PFNGLBINDTEXTUREUNITPARAMETEREXTPROC$FUNC, session);
    }
    static PFNGLBINDTEXTUREUNITPARAMETEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _unit, int _value) -> {
            try {
                return (int)constants$777.PFNGLBINDTEXTUREUNITPARAMETEREXTPROC$MH.invokeExact((Addressable)symbol, _unit, _value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


