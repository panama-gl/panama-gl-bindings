// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLCOPYCONVOLUTIONFILTER2DEXTPROC {

    void apply(int target, int internalformat, int x, int y, int width, int height);
    static MemorySegment allocate(PFNGLCOPYCONVOLUTIONFILTER2DEXTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLCOPYCONVOLUTIONFILTER2DEXTPROC.class, fi, constants$522.PFNGLCOPYCONVOLUTIONFILTER2DEXTPROC$FUNC, session);
    }
    static PFNGLCOPYCONVOLUTIONFILTER2DEXTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _internalformat, int _x, int _y, int _width, int _height) -> {
            try {
                constants$522.PFNGLCOPYCONVOLUTIONFILTER2DEXTPROC$MH.invokeExact((Addressable)symbol, _target, _internalformat, _x, _y, _width, _height);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


