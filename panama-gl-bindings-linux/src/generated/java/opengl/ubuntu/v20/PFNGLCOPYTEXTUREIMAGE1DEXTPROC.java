// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOPYTEXTUREIMAGE1DEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7);
    static MemoryAddress allocate(PFNGLCOPYTEXTUREIMAGE1DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOPYTEXTUREIMAGE1DEXTPROC.class, fi, constants$544.PFNGLCOPYTEXTUREIMAGE1DEXTPROC$FUNC, "(IIIIIIII)V");
    }
    static MemoryAddress allocate(PFNGLCOPYTEXTUREIMAGE1DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOPYTEXTUREIMAGE1DEXTPROC.class, fi, constants$544.PFNGLCOPYTEXTUREIMAGE1DEXTPROC$FUNC, "(IIIIIIII)V", scope);
    }
    static PFNGLCOPYTEXTUREIMAGE1DEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7) -> {
            try {
                constants$544.PFNGLCOPYTEXTUREIMAGE1DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


