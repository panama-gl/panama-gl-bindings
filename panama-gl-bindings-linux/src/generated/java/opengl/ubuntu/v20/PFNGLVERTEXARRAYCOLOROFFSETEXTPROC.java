// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXARRAYCOLOROFFSETEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, long x5);
    static MemoryAddress allocate(PFNGLVERTEXARRAYCOLOROFFSETEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYCOLOROFFSETEXTPROC.class, fi, constants$602.PFNGLVERTEXARRAYCOLOROFFSETEXTPROC$FUNC, "(IIIIIJ)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXARRAYCOLOROFFSETEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYCOLOROFFSETEXTPROC.class, fi, constants$602.PFNGLVERTEXARRAYCOLOROFFSETEXTPROC$FUNC, "(IIIIIJ)V", scope);
    }
    static PFNGLVERTEXARRAYCOLOROFFSETEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, long x5) -> {
            try {
                constants$602.PFNGLVERTEXARRAYCOLOROFFSETEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


