// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNORMALPOINTERVINTELPROC {

    void apply(int type, java.lang.foreign.MemoryAddress pointer);
    static MemorySegment allocate(PFNGLNORMALPOINTERVINTELPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNORMALPOINTERVINTELPROC.class, fi, constants$706.PFNGLNORMALPOINTERVINTELPROC$FUNC, session);
    }
    static PFNGLNORMALPOINTERVINTELPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _type, java.lang.foreign.MemoryAddress _pointer) -> {
            try {
                constants$706.PFNGLNORMALPOINTERVINTELPROC$MH.invokeExact((Addressable)symbol, _type, (java.lang.foreign.Addressable)_pointer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


