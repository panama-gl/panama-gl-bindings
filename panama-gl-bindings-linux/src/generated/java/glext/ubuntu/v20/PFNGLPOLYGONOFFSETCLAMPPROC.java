// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPOLYGONOFFSETCLAMPPROC {

    void apply(float factor, float units, float clamp);
    static MemorySegment allocate(PFNGLPOLYGONOFFSETCLAMPPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPOLYGONOFFSETCLAMPPROC.class, fi, constants$312.PFNGLPOLYGONOFFSETCLAMPPROC$FUNC, session);
    }
    static PFNGLPOLYGONOFFSETCLAMPPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (float _factor, float _units, float _clamp) -> {
            try {
                constants$312.PFNGLPOLYGONOFFSETCLAMPPROC$MH.invokeExact((Addressable)symbol, _factor, _units, _clamp);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


