// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIB3FARBPROC {

    void apply(int x0, float x1, float x2, float x3);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB3FARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB3FARBPROC.class, fi, constants$475.PFNGLVERTEXATTRIB3FARBPROC$FUNC, "(IFFF)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB3FARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB3FARBPROC.class, fi, constants$475.PFNGLVERTEXATTRIB3FARBPROC$FUNC, "(IFFF)V", scope);
    }
    static PFNGLVERTEXATTRIB3FARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1, float x2, float x3) -> {
            try {
                constants$475.PFNGLVERTEXATTRIB3FARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


