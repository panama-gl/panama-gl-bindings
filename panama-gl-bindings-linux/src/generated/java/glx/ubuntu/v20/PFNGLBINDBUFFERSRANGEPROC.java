// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINDBUFFERSRANGEPROC {

    void apply(int target, int first, int count, java.lang.foreign.MemoryAddress buffers, java.lang.foreign.MemoryAddress offsets, java.lang.foreign.MemoryAddress sizes);
    static MemorySegment allocate(PFNGLBINDBUFFERSRANGEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINDBUFFERSRANGEPROC.class, fi, constants$354.PFNGLBINDBUFFERSRANGEPROC$FUNC, session);
    }
    static PFNGLBINDBUFFERSRANGEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _first, int _count, java.lang.foreign.MemoryAddress _buffers, java.lang.foreign.MemoryAddress _offsets, java.lang.foreign.MemoryAddress _sizes) -> {
            try {
                constants$354.PFNGLBINDBUFFERSRANGEPROC$MH.invokeExact((Addressable)symbol, _target, _first, _count, (java.lang.foreign.Addressable)_buffers, (java.lang.foreign.Addressable)_offsets, (java.lang.foreign.Addressable)_sizes);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

