// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTITEXIMAGE2DEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, jdk.incubator.foreign.MemoryAddress x9);
    static MemoryAddress allocate(PFNGLMULTITEXIMAGE2DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXIMAGE2DEXTPROC.class, fi, constants$555.PFNGLMULTITEXIMAGE2DEXTPROC$FUNC, "(IIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXIMAGE2DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXIMAGE2DEXTPROC.class, fi, constants$555.PFNGLMULTITEXIMAGE2DEXTPROC$FUNC, "(IIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLMULTITEXIMAGE2DEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, jdk.incubator.foreign.MemoryAddress x9) -> {
            try {
                constants$555.PFNGLMULTITEXIMAGE2DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8, x9);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


