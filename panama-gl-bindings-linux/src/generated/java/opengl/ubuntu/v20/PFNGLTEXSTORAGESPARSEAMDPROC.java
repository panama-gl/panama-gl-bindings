// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXSTORAGESPARSEAMDPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6);
    static MemoryAddress allocate(PFNGLTEXSTORAGESPARSEAMDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXSTORAGESPARSEAMDPROC.class, fi, constants$473.PFNGLTEXSTORAGESPARSEAMDPROC$FUNC, "(IIIIIII)V");
    }
    static MemoryAddress allocate(PFNGLTEXSTORAGESPARSEAMDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXSTORAGESPARSEAMDPROC.class, fi, constants$473.PFNGLTEXSTORAGESPARSEAMDPROC$FUNC, "(IIIIIII)V", scope);
    }
    static PFNGLTEXSTORAGESPARSEAMDPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6) -> {
            try {
                constants$473.PFNGLTEXSTORAGESPARSEAMDPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


