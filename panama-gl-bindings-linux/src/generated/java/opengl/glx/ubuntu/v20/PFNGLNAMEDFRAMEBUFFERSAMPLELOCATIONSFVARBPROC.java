// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC.class, fi, constants$442.PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC.class, fi, constants$442.PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$442.PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

