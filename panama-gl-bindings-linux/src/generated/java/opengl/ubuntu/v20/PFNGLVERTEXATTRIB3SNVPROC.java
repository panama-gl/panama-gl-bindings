// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIB3SNVPROC {

    void apply(int x0, short x1, short x2, short x3);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB3SNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB3SNVPROC.class, fi, constants$863.PFNGLVERTEXATTRIB3SNVPROC$FUNC, "(ISSS)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB3SNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB3SNVPROC.class, fi, constants$863.PFNGLVERTEXATTRIB3SNVPROC$FUNC, "(ISSS)V", scope);
    }
    static PFNGLVERTEXATTRIB3SNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, short x1, short x2, short x3) -> {
            try {
                constants$863.PFNGLVERTEXATTRIB3SNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

