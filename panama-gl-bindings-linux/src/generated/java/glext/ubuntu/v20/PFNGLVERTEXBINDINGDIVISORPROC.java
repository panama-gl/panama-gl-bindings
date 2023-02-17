// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLVERTEXBINDINGDIVISORPROC {

    void apply(int bindingindex, int divisor);
    static MemorySegment allocate(PFNGLVERTEXBINDINGDIVISORPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXBINDINGDIVISORPROC.class, fi, constants$344.PFNGLVERTEXBINDINGDIVISORPROC$FUNC, session);
    }
    static PFNGLVERTEXBINDINGDIVISORPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _bindingindex, int _divisor) -> {
            try {
                constants$344.PFNGLVERTEXBINDINGDIVISORPROC$MH.invokeExact((Addressable)symbol, _bindingindex, _divisor);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


