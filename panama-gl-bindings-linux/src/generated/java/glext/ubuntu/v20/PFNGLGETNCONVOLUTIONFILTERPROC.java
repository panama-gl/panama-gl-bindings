// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLGETNCONVOLUTIONFILTERPROC {

    void apply(int target, int format, int type, int bufSize, java.lang.foreign.MemoryAddress image);
    static MemorySegment allocate(PFNGLGETNCONVOLUTIONFILTERPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLGETNCONVOLUTIONFILTERPROC.class, fi, constants$398.PFNGLGETNCONVOLUTIONFILTERPROC$FUNC, session);
    }
    static PFNGLGETNCONVOLUTIONFILTERPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _format, int _type, int _bufSize, java.lang.foreign.MemoryAddress _image) -> {
            try {
                constants$398.PFNGLGETNCONVOLUTIONFILTERPROC$MH.invokeExact((Addressable)symbol, _target, _format, _type, _bufSize, (java.lang.foreign.Addressable)_image);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


