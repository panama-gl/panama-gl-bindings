// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDRAWRANGEELEMENTSPROC {

    void apply(int mode, int start, int end, int count, int type, java.lang.foreign.MemoryAddress indices);
    static MemorySegment allocate(PFNGLDRAWRANGEELEMENTSPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDRAWRANGEELEMENTSPROC.class, fi, constants$56.PFNGLDRAWRANGEELEMENTSPROC$FUNC, session);
    }
    static PFNGLDRAWRANGEELEMENTSPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, int _start, int _end, int _count, int _type, java.lang.foreign.MemoryAddress _indices) -> {
            try {
                constants$56.PFNGLDRAWRANGEELEMENTSPROC$MH.invokeExact((Addressable)symbol, _mode, _start, _end, _count, _type, (java.lang.foreign.Addressable)_indices);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


