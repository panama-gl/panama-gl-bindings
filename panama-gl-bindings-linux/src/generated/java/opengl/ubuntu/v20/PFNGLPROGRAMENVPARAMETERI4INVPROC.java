// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMENVPARAMETERI4INVPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5);
    static MemoryAddress allocate(PFNGLPROGRAMENVPARAMETERI4INVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMENVPARAMETERI4INVPROC.class, fi, constants$760.PFNGLPROGRAMENVPARAMETERI4INVPROC$FUNC, "(IIIIII)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMENVPARAMETERI4INVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMENVPARAMETERI4INVPROC.class, fi, constants$760.PFNGLPROGRAMENVPARAMETERI4INVPROC$FUNC, "(IIIIII)V", scope);
    }
    static PFNGLPROGRAMENVPARAMETERI4INVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5) -> {
            try {
                constants$760.PFNGLPROGRAMENVPARAMETERI4INVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


