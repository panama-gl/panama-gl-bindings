// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXDELAYBEFORESWAPNVPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, long x1, float x2);
    static MemoryAddress allocate(PFNGLXDELAYBEFORESWAPNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXDELAYBEFORESWAPNVPROC.class, fi, constants$1039.PFNGLXDELAYBEFORESWAPNVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JF)I");
    }
    static MemoryAddress allocate(PFNGLXDELAYBEFORESWAPNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXDELAYBEFORESWAPNVPROC.class, fi, constants$1039.PFNGLXDELAYBEFORESWAPNVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JF)I", scope);
    }
    static PFNGLXDELAYBEFORESWAPNVPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, long x1, float x2) -> {
            try {
                return (int)constants$1039.PFNGLXDELAYBEFORESWAPNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


