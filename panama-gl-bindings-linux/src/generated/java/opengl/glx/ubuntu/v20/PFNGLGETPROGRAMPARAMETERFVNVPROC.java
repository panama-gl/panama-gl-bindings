// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETPROGRAMPARAMETERFVNVPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLGETPROGRAMPARAMETERFVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETPROGRAMPARAMETERFVNVPROC.class, fi, constants$937.PFNGLGETPROGRAMPARAMETERFVNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETPROGRAMPARAMETERFVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETPROGRAMPARAMETERFVNVPROC.class, fi, constants$937.PFNGLGETPROGRAMPARAMETERFVNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETPROGRAMPARAMETERFVNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$937.PFNGLGETPROGRAMPARAMETERFVNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


