// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMAKEIMAGEHANDLERESIDENTNVPROC {

    void apply(long x0, int x1);
    static MemoryAddress allocate(PFNGLMAKEIMAGEHANDLERESIDENTNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMAKEIMAGEHANDLERESIDENTNVPROC.class, fi, constants$813.PFNGLMAKEIMAGEHANDLERESIDENTNVPROC$FUNC, "(JI)V");
    }
    static MemoryAddress allocate(PFNGLMAKEIMAGEHANDLERESIDENTNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMAKEIMAGEHANDLERESIDENTNVPROC.class, fi, constants$813.PFNGLMAKEIMAGEHANDLERESIDENTNVPROC$FUNC, "(JI)V", scope);
    }
    static PFNGLMAKEIMAGEHANDLERESIDENTNVPROC ofAddress(MemoryAddress addr) {
        return (long x0, int x1) -> {
            try {
                constants$813.PFNGLMAKEIMAGEHANDLERESIDENTNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


