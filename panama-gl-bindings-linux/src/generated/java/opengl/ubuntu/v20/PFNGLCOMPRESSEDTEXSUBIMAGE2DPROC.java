// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, jdk.incubator.foreign.MemoryAddress x8);
    static MemoryAddress allocate(PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC.class, fi, constants$73.PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC$FUNC, "(IIIIIIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC.class, fi, constants$73.PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC$FUNC, "(IIIIIIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, jdk.incubator.foreign.MemoryAddress x8) -> {
            try {
                constants$73.PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


