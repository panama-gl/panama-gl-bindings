// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNPOLYGONSTIPPLEARBPROC {

    void apply(int bufSize, java.lang.foreign.MemoryAddress pattern);
    static MemorySegment allocate(PFNGLGETNPOLYGONSTIPPLEARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNPOLYGONSTIPPLEARBPROC.class, fi, constants$354.PFNGLGETNPOLYGONSTIPPLEARBPROC$FUNC, session);
    }
    static PFNGLGETNPOLYGONSTIPPLEARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _bufSize, java.lang.foreign.MemoryAddress _pattern) -> {
            try {
                constants$354.PFNGLGETNPOLYGONSTIPPLEARBPROC$MH.invokeExact((Addressable)symbol, _bufSize, (java.lang.foreign.Addressable)_pattern);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


