// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETCLIPPLANEXOESPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGETCLIPPLANEXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETCLIPPLANEXOESPROC.class, fi, constants$416.PFNGLGETCLIPPLANEXOESPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETCLIPPLANEXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETCLIPPLANEXOESPROC.class, fi, constants$416.PFNGLGETCLIPPLANEXOESPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETCLIPPLANEXOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$416.PFNGLGETCLIPPLANEXOESPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


