// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC.class, fi, constants$441.PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC.class, fi, constants$441.PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$441.PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


