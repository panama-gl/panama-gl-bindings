// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCREATEBUFFERSPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLCREATEBUFFERSPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCREATEBUFFERSPROC.class, fi, constants$272.PFNGLCREATEBUFFERSPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCREATEBUFFERSPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCREATEBUFFERSPROC.class, fi, constants$272.PFNGLCREATEBUFFERSPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCREATEBUFFERSPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$272.PFNGLCREATEBUFFERSPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


