// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLNAMEDFRAMEBUFFERTEXTUREPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERTEXTUREPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERTEXTUREPROC.class, fi, constants$364.PFNGLNAMEDFRAMEBUFFERTEXTUREPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERTEXTUREPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERTEXTUREPROC.class, fi, constants$364.PFNGLNAMEDFRAMEBUFFERTEXTUREPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLNAMEDFRAMEBUFFERTEXTUREPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$364.PFNGLNAMEDFRAMEBUFFERTEXTUREPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


