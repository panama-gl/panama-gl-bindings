// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGENSAMPLERSPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGENSAMPLERSPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGENSAMPLERSPROC.class, fi, constants$185.PFNGLGENSAMPLERSPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGENSAMPLERSPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGENSAMPLERSPROC.class, fi, constants$185.PFNGLGENSAMPLERSPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGENSAMPLERSPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$185.PFNGLGENSAMPLERSPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


