// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTITEXCOORD4FARBPROC {

    void apply(int x0, float x1, float x2, float x3, float x4);
    static MemoryAddress allocate(PFNGLMULTITEXCOORD4FARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD4FARBPROC.class, fi, constants$89.PFNGLMULTITEXCOORD4FARBPROC$FUNC, "(IFFFF)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXCOORD4FARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD4FARBPROC.class, fi, constants$89.PFNGLMULTITEXCOORD4FARBPROC$FUNC, "(IFFFF)V", scope);
    }
    static PFNGLMULTITEXCOORD4FARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1, float x2, float x3, float x4) -> {
            try {
                constants$89.PFNGLMULTITEXCOORD4FARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


