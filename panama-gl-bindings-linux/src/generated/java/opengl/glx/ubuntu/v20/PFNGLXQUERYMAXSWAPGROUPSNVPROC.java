// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXQUERYMAXSWAPGROUPSNVPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLXQUERYMAXSWAPGROUPSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXQUERYMAXSWAPGROUPSNVPROC.class, fi, constants$1041.PFNGLXQUERYMAXSWAPGROUPSNVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLXQUERYMAXSWAPGROUPSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXQUERYMAXSWAPGROUPSNVPROC.class, fi, constants$1041.PFNGLXQUERYMAXSWAPGROUPSNVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLXQUERYMAXSWAPGROUPSNVPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                return (int)constants$1041.PFNGLXQUERYMAXSWAPGROUPSNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

