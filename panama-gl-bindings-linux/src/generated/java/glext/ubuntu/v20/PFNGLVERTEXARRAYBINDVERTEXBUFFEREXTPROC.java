// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROC {

    void apply(int vaobj, int bindingindex, int buffer, long offset, int stride);
    static MemorySegment allocate(PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROC.class, fi, constants$618.PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROC$FUNC, session);
    }
    static PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _vaobj, int _bindingindex, int _buffer, long _offset, int _stride) -> {
            try {
                constants$618.PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROC$MH.invokeExact((Addressable)symbol, _vaobj, _bindingindex, _buffer, _offset, _stride);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


