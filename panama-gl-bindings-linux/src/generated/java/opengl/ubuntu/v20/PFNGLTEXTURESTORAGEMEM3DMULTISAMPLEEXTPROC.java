// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXTURESTORAGEMEM3DMULTISAMPLEEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, byte x6, int x7, long x8);
    static MemoryAddress allocate(PFNGLTEXTURESTORAGEMEM3DMULTISAMPLEEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGEMEM3DMULTISAMPLEEXTPROC.class, fi, constants$645.PFNGLTEXTURESTORAGEMEM3DMULTISAMPLEEXTPROC$FUNC, "(IIIIIIBIJ)V");
    }
    static MemoryAddress allocate(PFNGLTEXTURESTORAGEMEM3DMULTISAMPLEEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGEMEM3DMULTISAMPLEEXTPROC.class, fi, constants$645.PFNGLTEXTURESTORAGEMEM3DMULTISAMPLEEXTPROC$FUNC, "(IIIIIIBIJ)V", scope);
    }
    static PFNGLTEXTURESTORAGEMEM3DMULTISAMPLEEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, byte x6, int x7, long x8) -> {
            try {
                constants$645.PFNGLTEXTURESTORAGEMEM3DMULTISAMPLEEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

