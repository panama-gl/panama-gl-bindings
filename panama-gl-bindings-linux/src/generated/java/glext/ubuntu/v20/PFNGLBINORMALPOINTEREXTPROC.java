// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBINORMALPOINTEREXTPROC {

    void apply(int type, int stride, java.lang.foreign.MemoryAddress pointer);
    static MemorySegment allocate(PFNGLBINORMALPOINTEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBINORMALPOINTEREXTPROC.class, fi, constants$747.PFNGLBINORMALPOINTEREXTPROC$FUNC, session);
    }
    static PFNGLBINORMALPOINTEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _type, int _stride, java.lang.foreign.MemoryAddress _pointer) -> {
            try {
                constants$747.PFNGLBINORMALPOINTEREXTPROC$MH.invokeExact((Addressable)symbol, _type, _stride, (java.lang.foreign.Addressable)_pointer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

