// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXTURESTORAGE2DEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5);
    static MemoryAddress allocate(PFNGLTEXTURESTORAGE2DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGE2DEXTPROC.class, fi, constants$616.PFNGLTEXTURESTORAGE2DEXTPROC$FUNC, "(IIIIII)V");
    }
    static MemoryAddress allocate(PFNGLTEXTURESTORAGE2DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGE2DEXTPROC.class, fi, constants$616.PFNGLTEXTURESTORAGE2DEXTPROC$FUNC, "(IIIIII)V", scope);
    }
    static PFNGLTEXTURESTORAGE2DEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5) -> {
            try {
                constants$616.PFNGLTEXTURESTORAGE2DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


