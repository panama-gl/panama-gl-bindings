// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLUNIFORM1I64NVPROC {

    void apply(int x0, long x1);
    static MemoryAddress allocate(PFNGLUNIFORM1I64NVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM1I64NVPROC.class, fi, constants$455.PFNGLUNIFORM1I64NVPROC$FUNC, "(IJ)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORM1I64NVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM1I64NVPROC.class, fi, constants$455.PFNGLUNIFORM1I64NVPROC$FUNC, "(IJ)V", scope);
    }
    static PFNGLUNIFORM1I64NVPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1) -> {
            try {
                constants$455.PFNGLUNIFORM1I64NVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


