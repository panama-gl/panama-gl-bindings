// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVDPAUISSURFACENVPROC {

    byte apply(long x0);
    static MemoryAddress allocate(PFNGLVDPAUISSURFACENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVDPAUISSURFACENVPROC.class, fi, constants$836.PFNGLVDPAUISSURFACENVPROC$FUNC, "(J)B");
    }
    static MemoryAddress allocate(PFNGLVDPAUISSURFACENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVDPAUISSURFACENVPROC.class, fi, constants$836.PFNGLVDPAUISSURFACENVPROC$FUNC, "(J)B", scope);
    }
    static PFNGLVDPAUISSURFACENVPROC ofAddress(MemoryAddress addr) {
        return (long x0) -> {
            try {
                return (byte)constants$836.PFNGLVDPAUISSURFACENVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


