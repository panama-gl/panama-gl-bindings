// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXTURESTORAGEMEM3DEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, long x7);
    static MemoryAddress allocate(PFNGLTEXTURESTORAGEMEM3DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGEMEM3DEXTPROC.class, fi, constants$730.PFNGLTEXTURESTORAGEMEM3DEXTPROC$FUNC, "(IIIIIIIJ)V");
    }
    static MemoryAddress allocate(PFNGLTEXTURESTORAGEMEM3DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGEMEM3DEXTPROC.class, fi, constants$730.PFNGLTEXTURESTORAGEMEM3DEXTPROC$FUNC, "(IIIIIIIJ)V", scope);
    }
    static PFNGLTEXTURESTORAGEMEM3DEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, long x7) -> {
            try {
                constants$730.PFNGLTEXTURESTORAGEMEM3DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

