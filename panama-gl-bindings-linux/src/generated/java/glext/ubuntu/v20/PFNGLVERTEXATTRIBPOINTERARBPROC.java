// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXATTRIBPOINTERARBPROC {

    void apply(int index, int size, int type, byte normalized, int stride, java.lang.foreign.MemoryAddress pointer);
    static MemorySegment allocate(PFNGLVERTEXATTRIBPOINTERARBPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBPOINTERARBPROC.class, fi, constants$543.PFNGLVERTEXATTRIBPOINTERARBPROC$FUNC, session);
    }
    static PFNGLVERTEXATTRIBPOINTERARBPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _index, int _size, int _type, byte _normalized, int _stride, java.lang.foreign.MemoryAddress _pointer) -> {
            try {
                constants$543.PFNGLVERTEXATTRIBPOINTERARBPROC$MH.invokeExact((Addressable)symbol, _index, _size, _type, _normalized, _stride, (java.lang.foreign.Addressable)_pointer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


