// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOPYCONVOLUTIONFILTER1DEXTPROC {

    void apply(int target, int internalformat, int x, int y, int width);
    static MemorySegment allocate(PFNGLCOPYCONVOLUTIONFILTER1DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOPYCONVOLUTIONFILTER1DEXTPROC.class, fi, constants$522.PFNGLCOPYCONVOLUTIONFILTER1DEXTPROC$FUNC, session);
    }
    static PFNGLCOPYCONVOLUTIONFILTER1DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _internalformat, int _x, int _y, int _width) -> {
            try {
                constants$522.PFNGLCOPYCONVOLUTIONFILTER1DEXTPROC$MH.invokeExact((Addressable)symbol, _target, _internalformat, _x, _y, _width);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


