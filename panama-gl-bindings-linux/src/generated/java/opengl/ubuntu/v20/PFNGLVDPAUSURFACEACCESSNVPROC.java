// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVDPAUSURFACEACCESSNVPROC {

    void apply(long x0, int x1);
    static MemoryAddress allocate(PFNGLVDPAUSURFACEACCESSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVDPAUSURFACEACCESSNVPROC.class, fi, constants$837.PFNGLVDPAUSURFACEACCESSNVPROC$FUNC, "(JI)V");
    }
    static MemoryAddress allocate(PFNGLVDPAUSURFACEACCESSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVDPAUSURFACEACCESSNVPROC.class, fi, constants$837.PFNGLVDPAUSURFACEACCESSNVPROC$FUNC, "(JI)V", scope);
    }
    static PFNGLVDPAUSURFACEACCESSNVPROC ofAddress(MemoryAddress addr) {
        return (long x0, int x1) -> {
            try {
                constants$837.PFNGLVDPAUSURFACEACCESSNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


