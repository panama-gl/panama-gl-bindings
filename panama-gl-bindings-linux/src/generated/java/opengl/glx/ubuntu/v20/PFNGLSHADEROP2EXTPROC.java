// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSHADEROP2EXTPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLSHADEROP2EXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSHADEROP2EXTPROC.class, fi, constants$769.PFNGLSHADEROP2EXTPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLSHADEROP2EXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSHADEROP2EXTPROC.class, fi, constants$769.PFNGLSHADEROP2EXTPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLSHADEROP2EXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$769.PFNGLSHADEROP2EXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

