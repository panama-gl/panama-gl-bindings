// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLWAITSEMAPHOREUI64NVXPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLWAITSEMAPHOREUI64NVXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWAITSEMAPHOREUI64NVXPROC.class, fi, constants$724.PFNGLWAITSEMAPHOREUI64NVXPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLWAITSEMAPHOREUI64NVXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWAITSEMAPHOREUI64NVXPROC.class, fi, constants$724.PFNGLWAITSEMAPHOREUI64NVXPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLWAITSEMAPHOREUI64NVXPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$724.PFNGLWAITSEMAPHOREUI64NVXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


