// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXHYPERPIPECONFIGSGIXPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLXHYPERPIPECONFIGSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXHYPERPIPECONFIGSGIXPROC.class, fi, constants$1050.PFNGLXHYPERPIPECONFIGSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLXHYPERPIPECONFIGSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXHYPERPIPECONFIGSGIXPROC.class, fi, constants$1050.PFNGLXHYPERPIPECONFIGSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLXHYPERPIPECONFIGSGIXPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                return (int)constants$1051.PFNGLXHYPERPIPECONFIGSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


