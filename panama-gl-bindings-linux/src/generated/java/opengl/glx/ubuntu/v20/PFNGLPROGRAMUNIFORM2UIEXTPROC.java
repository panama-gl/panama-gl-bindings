// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORM2UIEXTPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM2UIEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2UIEXTPROC.class, fi, constants$669.PFNGLPROGRAMUNIFORM2UIEXTPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM2UIEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2UIEXTPROC.class, fi, constants$669.PFNGLPROGRAMUNIFORM2UIEXTPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLPROGRAMUNIFORM2UIEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$669.PFNGLPROGRAMUNIFORM2UIEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


