// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLMULTIDRAWELEMENTSPROC {

    void apply(int mode, java.lang.foreign.MemoryAddress count, int type, java.lang.foreign.MemoryAddress indices, int drawcount);
    static MemorySegment allocate(PFNGLMULTIDRAWELEMENTSPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWELEMENTSPROC.class, fi, constants$177.PFNGLMULTIDRAWELEMENTSPROC$FUNC, session);
    }
    static PFNGLMULTIDRAWELEMENTSPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode, java.lang.foreign.MemoryAddress _count, int _type, java.lang.foreign.MemoryAddress _indices, int _drawcount) -> {
            try {
                constants$177.PFNGLMULTIDRAWELEMENTSPROC$MH.invokeExact((Addressable)symbol, _mode, (java.lang.foreign.Addressable)_count, _type, (java.lang.foreign.Addressable)_indices, _drawcount);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


