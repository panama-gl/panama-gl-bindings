// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXTURESUBIMAGE3DEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9, int x10, jdk.incubator.foreign.MemoryAddress x11);
    static MemoryAddress allocate(PFNGLTEXTURESUBIMAGE3DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESUBIMAGE3DEXTPROC.class, fi, constants$547.PFNGLTEXTURESUBIMAGE3DEXTPROC$FUNC, "(IIIIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLTEXTURESUBIMAGE3DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESUBIMAGE3DEXTPROC.class, fi, constants$547.PFNGLTEXTURESUBIMAGE3DEXTPROC$FUNC, "(IIIIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLTEXTURESUBIMAGE3DEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9, int x10, jdk.incubator.foreign.MemoryAddress x11) -> {
            try {
                constants$547.PFNGLTEXTURESUBIMAGE3DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

