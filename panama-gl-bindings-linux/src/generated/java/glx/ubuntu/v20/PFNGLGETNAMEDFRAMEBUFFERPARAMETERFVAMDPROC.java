// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNAMEDFRAMEBUFFERPARAMETERFVAMDPROC {

    void apply(int framebuffer, int pname, int numsamples, int pixelindex, int size, java.lang.foreign.MemoryAddress values);
    static MemorySegment allocate(PFNGLGETNAMEDFRAMEBUFFERPARAMETERFVAMDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDFRAMEBUFFERPARAMETERFVAMDPROC.class, fi, constants$540.PFNGLGETNAMEDFRAMEBUFFERPARAMETERFVAMDPROC$FUNC, session);
    }
    static PFNGLGETNAMEDFRAMEBUFFERPARAMETERFVAMDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _framebuffer, int _pname, int _numsamples, int _pixelindex, int _size, java.lang.foreign.MemoryAddress _values) -> {
            try {
                constants$540.PFNGLGETNAMEDFRAMEBUFFERPARAMETERFVAMDPROC$MH.invokeExact((Addressable)symbol, _framebuffer, _pname, _numsamples, _pixelindex, _size, (java.lang.foreign.Addressable)_values);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


