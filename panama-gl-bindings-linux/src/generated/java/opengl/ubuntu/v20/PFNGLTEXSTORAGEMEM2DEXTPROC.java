// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXSTORAGEMEM2DEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, long x6);
    static MemoryAddress allocate(PFNGLTEXSTORAGEMEM2DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXSTORAGEMEM2DEXTPROC.class, fi, constants$643.PFNGLTEXSTORAGEMEM2DEXTPROC$FUNC, "(IIIIIIJ)V");
    }
    static MemoryAddress allocate(PFNGLTEXSTORAGEMEM2DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXSTORAGEMEM2DEXTPROC.class, fi, constants$643.PFNGLTEXSTORAGEMEM2DEXTPROC$FUNC, "(IIIIIIJ)V", scope);
    }
    static PFNGLTEXSTORAGEMEM2DEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, long x6) -> {
            try {
                constants$643.PFNGLTEXSTORAGEMEM2DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


