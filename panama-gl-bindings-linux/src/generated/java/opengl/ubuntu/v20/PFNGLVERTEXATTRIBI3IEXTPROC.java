// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIBI3IEXTPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBI3IEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI3IEXTPROC.class, fi, constants$871.PFNGLVERTEXATTRIBI3IEXTPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBI3IEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI3IEXTPROC.class, fi, constants$871.PFNGLVERTEXATTRIBI3IEXTPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLVERTEXATTRIBI3IEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$871.PFNGLVERTEXATTRIBI3IEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


