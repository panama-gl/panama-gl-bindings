// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOLORP4UIVPROC {

    void apply(int type, java.lang.foreign.MemoryAddress color);
    static MemorySegment allocate(PFNGLCOLORP4UIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOLORP4UIVPROC.class, fi, constants$288.PFNGLCOLORP4UIVPROC$FUNC, session);
    }
    static PFNGLCOLORP4UIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _type, java.lang.foreign.MemoryAddress _color) -> {
            try {
                constants$288.PFNGLCOLORP4UIVPROC$MH.invokeExact((Addressable)symbol, _type, (java.lang.foreign.Addressable)_color);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


