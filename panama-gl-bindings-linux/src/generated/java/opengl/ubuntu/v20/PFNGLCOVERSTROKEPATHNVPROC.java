// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOVERSTROKEPATHNVPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLCOVERSTROKEPATHNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOVERSTROKEPATHNVPROC.class, fi, constants$795.PFNGLCOVERSTROKEPATHNVPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLCOVERSTROKEPATHNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOVERSTROKEPATHNVPROC.class, fi, constants$795.PFNGLCOVERSTROKEPATHNVPROC$FUNC, "(II)V", scope);
    }
    static PFNGLCOVERSTROKEPATHNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$795.PFNGLCOVERSTROKEPATHNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


