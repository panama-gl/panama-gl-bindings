// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETPATHPARAMETERFVNVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETPATHPARAMETERFVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETPATHPARAMETERFVNVPROC.class, fi, constants$796.PFNGLGETPATHPARAMETERFVNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETPATHPARAMETERFVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETPATHPARAMETERFVNVPROC.class, fi, constants$796.PFNGLGETPATHPARAMETERFVNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETPATHPARAMETERFVNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$796.PFNGLGETPATHPARAMETERFVNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


