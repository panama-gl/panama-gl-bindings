// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC {

    void apply(int framebuffer, int pname, java.lang.foreign.MemoryAddress param);
    static MemorySegment allocate(PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC.class, fi, constants$368.PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC$FUNC, session);
    }
    static PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _framebuffer, int _pname, java.lang.foreign.MemoryAddress _param) -> {
            try {
                constants$368.PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC$MH.invokeExact((Addressable)symbol, _framebuffer, _pname, (java.lang.foreign.Addressable)_param);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


