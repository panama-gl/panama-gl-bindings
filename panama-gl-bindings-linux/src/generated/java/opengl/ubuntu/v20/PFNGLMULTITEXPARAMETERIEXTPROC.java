// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTITEXPARAMETERIEXTPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLMULTITEXPARAMETERIEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXPARAMETERIEXTPROC.class, fi, constants$554.PFNGLMULTITEXPARAMETERIEXTPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXPARAMETERIEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXPARAMETERIEXTPROC.class, fi, constants$554.PFNGLMULTITEXPARAMETERIEXTPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLMULTITEXPARAMETERIEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$554.PFNGLMULTITEXPARAMETERIEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


