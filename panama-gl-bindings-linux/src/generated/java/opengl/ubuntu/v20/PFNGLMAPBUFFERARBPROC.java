// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMAPBUFFERARBPROC {

    jdk.incubator.foreign.MemoryAddress apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLMAPBUFFERARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMAPBUFFERARBPROC.class, fi, constants$383.PFNGLMAPBUFFERARBPROC$FUNC, "(II)Ljdk/incubator/foreign/MemoryAddress;");
    }
    static MemoryAddress allocate(PFNGLMAPBUFFERARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMAPBUFFERARBPROC.class, fi, constants$383.PFNGLMAPBUFFERARBPROC$FUNC, "(II)Ljdk/incubator/foreign/MemoryAddress;", scope);
    }
    static PFNGLMAPBUFFERARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                return (jdk.incubator.foreign.MemoryAddress)constants$383.PFNGLMAPBUFFERARBPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


