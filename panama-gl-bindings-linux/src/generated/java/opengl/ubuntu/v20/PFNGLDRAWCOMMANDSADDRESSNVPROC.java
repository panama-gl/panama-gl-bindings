// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDRAWCOMMANDSADDRESSNVPROC {

    void apply(int primitiveMode, java.lang.foreign.MemoryAddress indirects, java.lang.foreign.MemoryAddress sizes, int count);
    static MemorySegment allocate(PFNGLDRAWCOMMANDSADDRESSNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDRAWCOMMANDSADDRESSNVPROC.class, fi, constants$734.PFNGLDRAWCOMMANDSADDRESSNVPROC$FUNC, session);
    }
    static PFNGLDRAWCOMMANDSADDRESSNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _primitiveMode, java.lang.foreign.MemoryAddress _indirects, java.lang.foreign.MemoryAddress _sizes, int _count) -> {
            try {
                constants$734.PFNGLDRAWCOMMANDSADDRESSNVPROC$MH.invokeExact((Addressable)symbol, _primitiveMode, (java.lang.foreign.Addressable)_indirects, (java.lang.foreign.Addressable)_sizes, _count);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


