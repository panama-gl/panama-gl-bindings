// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC {

    void apply(int framebuffer, int pname, int param);
    static MemorySegment allocate(PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC.class, fi, constants$278.PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC$FUNC, session);
    }
    static PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _framebuffer, int _pname, int _param) -> {
            try {
                constants$278.PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC$MH.invokeExact((Addressable)symbol, _framebuffer, _pname, _param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


