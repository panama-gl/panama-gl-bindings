// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIBIFORMATPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBIFORMATPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBIFORMATPROC.class, fi, constants$262.PFNGLVERTEXATTRIBIFORMATPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBIFORMATPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBIFORMATPROC.class, fi, constants$262.PFNGLVERTEXATTRIBIFORMATPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLVERTEXATTRIBIFORMATPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$262.PFNGLVERTEXATTRIBIFORMATPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


