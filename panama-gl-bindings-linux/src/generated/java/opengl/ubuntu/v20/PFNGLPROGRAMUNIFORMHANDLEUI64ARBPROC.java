// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORMHANDLEUI64ARBPROC {

    void apply(int x0, int x1, long x2);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORMHANDLEUI64ARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORMHANDLEUI64ARBPROC.class, fi, constants$315.PFNGLPROGRAMUNIFORMHANDLEUI64ARBPROC$FUNC, "(IIJ)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORMHANDLEUI64ARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORMHANDLEUI64ARBPROC.class, fi, constants$315.PFNGLPROGRAMUNIFORMHANDLEUI64ARBPROC$FUNC, "(IIJ)V", scope);
    }
    static PFNGLPROGRAMUNIFORMHANDLEUI64ARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, long x2) -> {
            try {
                constants$315.PFNGLPROGRAMUNIFORMHANDLEUI64ARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


