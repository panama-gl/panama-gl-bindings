// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLPROVOKINGVERTEXEXTPROC {

    void apply(int mode);
    static MemorySegment allocate(PFNGLPROVOKINGVERTEXEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLPROVOKINGVERTEXEXTPROC.class, fi, constants$739.PFNGLPROVOKINGVERTEXEXTPROC$FUNC, session);
    }
    static PFNGLPROVOKINGVERTEXEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mode) -> {
            try {
                constants$739.PFNGLPROVOKINGVERTEXEXTPROC$MH.invokeExact((Addressable)symbol, _mode);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


