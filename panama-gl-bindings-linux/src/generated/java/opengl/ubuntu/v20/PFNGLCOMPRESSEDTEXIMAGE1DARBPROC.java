// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOMPRESSEDTEXIMAGE1DARBPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6);
    static MemoryAddress allocate(PFNGLCOMPRESSEDTEXIMAGE1DARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDTEXIMAGE1DARBPROC.class, fi, constants$375.PFNGLCOMPRESSEDTEXIMAGE1DARBPROC$FUNC, "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCOMPRESSEDTEXIMAGE1DARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDTEXIMAGE1DARBPROC.class, fi, constants$375.PFNGLCOMPRESSEDTEXIMAGE1DARBPROC$FUNC, "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCOMPRESSEDTEXIMAGE1DARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6) -> {
            try {
                constants$375.PFNGLCOMPRESSEDTEXIMAGE1DARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


