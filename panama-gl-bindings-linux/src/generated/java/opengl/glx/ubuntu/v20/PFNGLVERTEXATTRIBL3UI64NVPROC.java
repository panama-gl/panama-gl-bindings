// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIBL3UI64NVPROC {

    void apply(int x0, long x1, long x2, long x3);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBL3UI64NVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBL3UI64NVPROC.class, fi, constants$928.PFNGLVERTEXATTRIBL3UI64NVPROC$FUNC, "(IJJJ)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBL3UI64NVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBL3UI64NVPROC.class, fi, constants$928.PFNGLVERTEXATTRIBL3UI64NVPROC$FUNC, "(IJJJ)V", scope);
    }
    static PFNGLVERTEXATTRIBL3UI64NVPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, long x2, long x3) -> {
            try {
                constants$928.PFNGLVERTEXATTRIBL3UI64NVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

