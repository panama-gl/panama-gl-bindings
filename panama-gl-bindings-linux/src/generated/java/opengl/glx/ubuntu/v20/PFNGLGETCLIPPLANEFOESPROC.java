// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETCLIPPLANEFOESPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGETCLIPPLANEFOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETCLIPPLANEFOESPROC.class, fi, constants$535.PFNGLGETCLIPPLANEFOESPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETCLIPPLANEFOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETCLIPPLANEFOESPROC.class, fi, constants$535.PFNGLGETCLIPPLANEFOESPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETCLIPPLANEFOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$535.PFNGLGETCLIPPLANEFOESPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

