// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXBINDCHANNELTOWINDOWSGIXPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, long x3);
    static MemoryAddress allocate(PFNGLXBINDCHANNELTOWINDOWSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXBINDCHANNELTOWINDOWSGIXPROC.class, fi, constants$1055.PFNGLXBINDCHANNELTOWINDOWSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IIJ)I");
    }
    static MemoryAddress allocate(PFNGLXBINDCHANNELTOWINDOWSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXBINDCHANNELTOWINDOWSGIXPROC.class, fi, constants$1055.PFNGLXBINDCHANNELTOWINDOWSGIXPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IIJ)I", scope);
    }
    static PFNGLXBINDCHANNELTOWINDOWSGIXPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, long x3) -> {
            try {
                return (int)constants$1056.PFNGLXBINDCHANNELTOWINDOWSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

