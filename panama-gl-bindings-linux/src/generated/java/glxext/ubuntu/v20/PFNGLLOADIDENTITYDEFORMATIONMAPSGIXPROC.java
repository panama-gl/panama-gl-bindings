// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLLOADIDENTITYDEFORMATIONMAPSGIXPROC {

    void apply(int mask);
    static MemorySegment allocate(PFNGLLOADIDENTITYDEFORMATIONMAPSGIXPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLLOADIDENTITYDEFORMATIONMAPSGIXPROC.class, fi, constants$990.PFNGLLOADIDENTITYDEFORMATIONMAPSGIXPROC$FUNC, session);
    }
    static PFNGLLOADIDENTITYDEFORMATIONMAPSGIXPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mask) -> {
            try {
                constants$990.PFNGLLOADIDENTITYDEFORMATIONMAPSGIXPROC$MH.invokeExact((Addressable)symbol, _mask);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


