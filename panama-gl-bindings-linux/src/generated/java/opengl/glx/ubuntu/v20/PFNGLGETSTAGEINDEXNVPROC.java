// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETSTAGEINDEXNVPROC {

    short apply(int x0);
    static MemoryAddress allocate(PFNGLGETSTAGEINDEXNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETSTAGEINDEXNVPROC.class, fi, constants$819.PFNGLGETSTAGEINDEXNVPROC$FUNC, "(I)S");
    }
    static MemoryAddress allocate(PFNGLGETSTAGEINDEXNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETSTAGEINDEXNVPROC.class, fi, constants$819.PFNGLGETSTAGEINDEXNVPROC$FUNC, "(I)S", scope);
    }
    static PFNGLGETSTAGEINDEXNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (short)constants$819.PFNGLGETSTAGEINDEXNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

