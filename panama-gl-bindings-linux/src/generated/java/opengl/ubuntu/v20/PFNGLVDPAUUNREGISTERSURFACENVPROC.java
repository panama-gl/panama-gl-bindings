// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVDPAUUNREGISTERSURFACENVPROC {

    void apply(long x0);
    static MemoryAddress allocate(PFNGLVDPAUUNREGISTERSURFACENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVDPAUUNREGISTERSURFACENVPROC.class, fi, constants$836.PFNGLVDPAUUNREGISTERSURFACENVPROC$FUNC, "(J)V");
    }
    static MemoryAddress allocate(PFNGLVDPAUUNREGISTERSURFACENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVDPAUUNREGISTERSURFACENVPROC.class, fi, constants$836.PFNGLVDPAUUNREGISTERSURFACENVPROC$FUNC, "(J)V", scope);
    }
    static PFNGLVDPAUUNREGISTERSURFACENVPROC ofAddress(MemoryAddress addr) {
        return (long x0) -> {
            try {
                constants$836.PFNGLVDPAUUNREGISTERSURFACENVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


