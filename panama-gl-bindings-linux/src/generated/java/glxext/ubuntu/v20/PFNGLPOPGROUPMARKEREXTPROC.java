// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPOPGROUPMARKEREXTPROC {

    void apply();
    static MemorySegment allocate(PFNGLPOPGROUPMARKEREXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPOPGROUPMARKEREXTPROC.class, fi, constants$620.PFNGLPOPGROUPMARKEREXTPROC$FUNC, session);
    }
    static PFNGLPOPGROUPMARKEREXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$620.PFNGLPOPGROUPMARKEREXTPROC$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

