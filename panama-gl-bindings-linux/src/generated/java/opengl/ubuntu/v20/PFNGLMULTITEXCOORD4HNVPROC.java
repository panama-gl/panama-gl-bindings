// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTITEXCOORD4HNVPROC {

    void apply(int x0, short x1, short x2, short x3, short x4);
    static MemoryAddress allocate(PFNGLMULTITEXCOORD4HNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD4HNVPROC.class, fi, constants$772.PFNGLMULTITEXCOORD4HNVPROC$FUNC, "(ISSSS)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXCOORD4HNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD4HNVPROC.class, fi, constants$772.PFNGLMULTITEXCOORD4HNVPROC$FUNC, "(ISSSS)V", scope);
    }
    static PFNGLMULTITEXCOORD4HNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, short x1, short x2, short x3, short x4) -> {
            try {
                constants$772.PFNGLMULTITEXCOORD4HNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


