// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSCISSORINDEXEDPROC {

    void apply(int x0, int x1, int x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLSCISSORINDEXEDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSCISSORINDEXEDPROC.class, fi, constants$246.PFNGLSCISSORINDEXEDPROC$FUNC, "(IIIII)V");
    }
    static MemoryAddress allocate(PFNGLSCISSORINDEXEDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSCISSORINDEXEDPROC.class, fi, constants$246.PFNGLSCISSORINDEXEDPROC$FUNC, "(IIIII)V", scope);
    }
    static PFNGLSCISSORINDEXEDPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4) -> {
            try {
                constants$246.PFNGLSCISSORINDEXEDPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


