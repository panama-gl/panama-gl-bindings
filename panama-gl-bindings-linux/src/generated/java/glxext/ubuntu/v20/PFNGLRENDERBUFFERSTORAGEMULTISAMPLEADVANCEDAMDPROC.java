// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLRENDERBUFFERSTORAGEMULTISAMPLEADVANCEDAMDPROC {

    void apply(int target, int samples, int storageSamples, int internalformat, int width, int height);
    static MemorySegment allocate(PFNGLRENDERBUFFERSTORAGEMULTISAMPLEADVANCEDAMDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLRENDERBUFFERSTORAGEMULTISAMPLEADVANCEDAMDPROC.class, fi, constants$539.PFNGLRENDERBUFFERSTORAGEMULTISAMPLEADVANCEDAMDPROC$FUNC, session);
    }
    static PFNGLRENDERBUFFERSTORAGEMULTISAMPLEADVANCEDAMDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _samples, int _storageSamples, int _internalformat, int _width, int _height) -> {
            try {
                constants$539.PFNGLRENDERBUFFERSTORAGEMULTISAMPLEADVANCEDAMDPROC$MH.invokeExact((Addressable)symbol, _target, _samples, _storageSamples, _internalformat, _width, _height);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

