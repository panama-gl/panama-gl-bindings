// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVNVPROC {

    void apply(int framebuffer, int start, int count, java.lang.foreign.MemoryAddress v);
    static MemorySegment allocate(PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVNVPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVNVPROC.class, fi, constants$903.PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVNVPROC$FUNC, session);
    }
    static PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVNVPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _framebuffer, int _start, int _count, java.lang.foreign.MemoryAddress _v) -> {
            try {
                constants$903.PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVNVPROC$MH.invokeExact((Addressable)symbol, _framebuffer, _start, _count, (java.lang.foreign.Addressable)_v);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


