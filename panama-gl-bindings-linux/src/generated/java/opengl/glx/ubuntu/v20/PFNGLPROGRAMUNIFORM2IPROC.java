// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORM2IPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM2IPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2IPROC.class, fi, constants$312.PFNGLPROGRAMUNIFORM2IPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM2IPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM2IPROC.class, fi, constants$312.PFNGLPROGRAMUNIFORM2IPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLPROGRAMUNIFORM2IPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$312.PFNGLPROGRAMUNIFORM2IPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


