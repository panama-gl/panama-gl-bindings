// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC {

    void apply(int mode, int start, int end, int count, int type, java.lang.foreign.MemoryAddress indices, int basevertex);
    static MemorySegment allocate(PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC.class, fi, constants$178.PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC$FUNC, session);
    }
    static PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, int _start, int _end, int _count, int _type, java.lang.foreign.MemoryAddress _indices, int _basevertex) -> {
            try {
                constants$178.PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC$MH.invokeExact((Addressable)symbol, _mode, _start, _end, _count, _type, (java.lang.foreign.Addressable)_indices, _basevertex);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


