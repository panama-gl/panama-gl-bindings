// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLBUFFERPARAMETERIAPPLEPROC {

    void apply(int target, int pname, int param);
    static MemorySegment allocate(PFNGLBUFFERPARAMETERIAPPLEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLBUFFERPARAMETERIAPPLEPROC.class, fi, constants$479.PFNGLBUFFERPARAMETERIAPPLEPROC$FUNC, session);
    }
    static PFNGLBUFFERPARAMETERIAPPLEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _pname, int _param) -> {
            try {
                constants$479.PFNGLBUFFERPARAMETERIAPPLEPROC$MH.invokeExact((Addressable)symbol, _target, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


