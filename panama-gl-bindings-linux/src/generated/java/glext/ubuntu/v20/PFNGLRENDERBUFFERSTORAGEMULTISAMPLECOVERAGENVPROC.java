// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLRENDERBUFFERSTORAGEMULTISAMPLECOVERAGENVPROC {

    void apply(int target, int coverageSamples, int colorSamples, int internalformat, int width, int height);
    static MemorySegment allocate(PFNGLRENDERBUFFERSTORAGEMULTISAMPLECOVERAGENVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLRENDERBUFFERSTORAGEMULTISAMPLECOVERAGENVPROC.class, fi, constants$752.PFNGLRENDERBUFFERSTORAGEMULTISAMPLECOVERAGENVPROC$FUNC, session);
    }
    static PFNGLRENDERBUFFERSTORAGEMULTISAMPLECOVERAGENVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _target, int _coverageSamples, int _colorSamples, int _internalformat, int _width, int _height) -> {
            try {
                constants$752.PFNGLRENDERBUFFERSTORAGEMULTISAMPLECOVERAGENVPROC$MH.invokeExact((Addressable)symbol, _target, _coverageSamples, _colorSamples, _internalformat, _width, _height);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


