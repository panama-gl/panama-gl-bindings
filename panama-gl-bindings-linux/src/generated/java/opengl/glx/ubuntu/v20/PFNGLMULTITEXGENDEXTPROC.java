// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTITEXGENDEXTPROC {

    void apply(int x0, int x1, int x2, double x3);
    static MemoryAddress allocate(PFNGLMULTITEXGENDEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXGENDEXTPROC.class, fi, constants$635.PFNGLMULTITEXGENDEXTPROC$FUNC, "(IIID)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXGENDEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXGENDEXTPROC.class, fi, constants$635.PFNGLMULTITEXGENDEXTPROC$FUNC, "(IIID)V", scope);
    }
    static PFNGLMULTITEXGENDEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, double x3) -> {
            try {
                constants$635.PFNGLMULTITEXGENDEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


