// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLNAMEDFRAMEBUFFERTEXTUREFACEEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERTEXTUREFACEEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERTEXTUREFACEEXTPROC.class, fi, constants$600.PFNGLNAMEDFRAMEBUFFERTEXTUREFACEEXTPROC$FUNC, "(IIIII)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERTEXTUREFACEEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERTEXTUREFACEEXTPROC.class, fi, constants$600.PFNGLNAMEDFRAMEBUFFERTEXTUREFACEEXTPROC$FUNC, "(IIIII)V", scope);
    }
    static PFNGLNAMEDFRAMEBUFFERTEXTUREFACEEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4) -> {
            try {
                constants$600.PFNGLNAMEDFRAMEBUFFERTEXTUREFACEEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

