// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPOINTPARAMETERFEXTPROC {

    void apply(int x0, float x1);
    static MemoryAddress allocate(PFNGLPOINTPARAMETERFEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPOINTPARAMETERFEXTPROC.class, fi, constants$652.PFNGLPOINTPARAMETERFEXTPROC$FUNC, "(IF)V");
    }
    static MemoryAddress allocate(PFNGLPOINTPARAMETERFEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPOINTPARAMETERFEXTPROC.class, fi, constants$652.PFNGLPOINTPARAMETERFEXTPROC$FUNC, "(IF)V", scope);
    }
    static PFNGLPOINTPARAMETERFEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1) -> {
            try {
                constants$652.PFNGLPOINTPARAMETERFEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


