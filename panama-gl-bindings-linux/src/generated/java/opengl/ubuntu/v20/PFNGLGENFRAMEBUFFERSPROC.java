// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGENFRAMEBUFFERSPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGENFRAMEBUFFERSPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGENFRAMEBUFFERSPROC.class, fi, constants$168.PFNGLGENFRAMEBUFFERSPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGENFRAMEBUFFERSPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGENFRAMEBUFFERSPROC.class, fi, constants$168.PFNGLGENFRAMEBUFFERSPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGENFRAMEBUFFERSPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$168.PFNGLGENFRAMEBUFFERSPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


