// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC {

    void apply(int renderbuffer, int samples, int internalformat, int width, int height);
    static MemorySegment allocate(PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC.class, fi, constants$369.PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC$FUNC, session);
    }
    static PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _renderbuffer, int _samples, int _internalformat, int _width, int _height) -> {
            try {
                constants$369.PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC$MH.invokeExact((Addressable)symbol, _renderbuffer, _samples, _internalformat, _width, _height);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

