// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCULLPARAMETERDVEXTPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLCULLPARAMETERDVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCULLPARAMETERDVEXTPROC.class, fi, constants$533.PFNGLCULLPARAMETERDVEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCULLPARAMETERDVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCULLPARAMETERDVEXTPROC.class, fi, constants$533.PFNGLCULLPARAMETERDVEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCULLPARAMETERDVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$533.PFNGLCULLPARAMETERDVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


