// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPATCHPARAMETERIPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLPATCHPARAMETERIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPATCHPARAMETERIPROC.class, fi, constants$300.PFNGLPATCHPARAMETERIPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLPATCHPARAMETERIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPATCHPARAMETERIPROC.class, fi, constants$300.PFNGLPATCHPARAMETERIPROC$FUNC, "(II)V", scope);
    }
    static PFNGLPATCHPARAMETERIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$300.PFNGLPATCHPARAMETERIPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


