// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC.class, fi, constants$704.PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC$FUNC, "(IIIII)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC.class, fi, constants$704.PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC$FUNC, "(IIIII)V", scope);
    }
    static PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4) -> {
            try {
                constants$704.PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


