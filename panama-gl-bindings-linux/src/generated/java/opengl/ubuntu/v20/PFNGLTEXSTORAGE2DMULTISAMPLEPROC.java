// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXSTORAGE2DMULTISAMPLEPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, byte x5);
    static MemoryAddress allocate(PFNGLTEXSTORAGE2DMULTISAMPLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXSTORAGE2DMULTISAMPLEPROC.class, fi, constants$261.PFNGLTEXSTORAGE2DMULTISAMPLEPROC$FUNC, "(IIIIIB)V");
    }
    static MemoryAddress allocate(PFNGLTEXSTORAGE2DMULTISAMPLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXSTORAGE2DMULTISAMPLEPROC.class, fi, constants$261.PFNGLTEXSTORAGE2DMULTISAMPLEPROC$FUNC, "(IIIIIB)V", scope);
    }
    static PFNGLTEXSTORAGE2DMULTISAMPLEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, byte x5) -> {
            try {
                constants$261.PFNGLTEXSTORAGE2DMULTISAMPLEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


