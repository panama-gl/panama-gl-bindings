// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLSECONDARYCOLORP3UIVPROC {

    void apply(int type, java.lang.foreign.MemoryAddress color);
    static MemorySegment allocate(PFNGLSECONDARYCOLORP3UIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLORP3UIVPROC.class, fi, constants$203.PFNGLSECONDARYCOLORP3UIVPROC$FUNC, session);
    }
    static PFNGLSECONDARYCOLORP3UIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _type, java.lang.foreign.MemoryAddress _color) -> {
            try {
                constants$203.PFNGLSECONDARYCOLORP3UIVPROC$MH.invokeExact((Addressable)symbol, _type, (java.lang.foreign.Addressable)_color);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


