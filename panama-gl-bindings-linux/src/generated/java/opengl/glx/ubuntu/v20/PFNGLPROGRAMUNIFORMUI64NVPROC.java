// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORMUI64NVPROC {

    void apply(int x0, int x1, long x2);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORMUI64NVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORMUI64NVPROC.class, fi, constants$908.PFNGLPROGRAMUNIFORMUI64NVPROC$FUNC, "(IIJ)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORMUI64NVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORMUI64NVPROC.class, fi, constants$908.PFNGLPROGRAMUNIFORMUI64NVPROC$FUNC, "(IIJ)V", scope);
    }
    static PFNGLPROGRAMUNIFORMUI64NVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, long x2) -> {
            try {
                constants$908.PFNGLPROGRAMUNIFORMUI64NVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

