// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, jdk.incubator.foreign.MemoryAddress x7);
    static MemoryAddress allocate(PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC.class, fi, constants$564.PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC$FUNC, "(IIIIIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC.class, fi, constants$564.PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC$FUNC, "(IIIIIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, jdk.incubator.foreign.MemoryAddress x7) -> {
            try {
                constants$564.PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


