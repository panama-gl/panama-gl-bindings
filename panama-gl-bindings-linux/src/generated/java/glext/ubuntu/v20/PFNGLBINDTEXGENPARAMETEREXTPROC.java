// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINDTEXGENPARAMETEREXTPROC {

    int apply(int unit, int coord, int value);
    static MemorySegment allocate(PFNGLBINDTEXGENPARAMETEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINDTEXGENPARAMETEREXTPROC.class, fi, constants$691.PFNGLBINDTEXGENPARAMETEREXTPROC$FUNC, session);
    }
    static PFNGLBINDTEXGENPARAMETEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _unit, int _coord, int _value) -> {
            try {
                return (int)constants$691.PFNGLBINDTEXGENPARAMETEREXTPROC$MH.invokeExact((Addressable)symbol, _unit, _coord, _value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


