// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXIMAGE3DMULTISAMPLECOVERAGENVPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, byte x7);
    static MemoryAddress allocate(PFNGLTEXIMAGE3DMULTISAMPLECOVERAGENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXIMAGE3DMULTISAMPLECOVERAGENVPROC.class, fi, constants$912.PFNGLTEXIMAGE3DMULTISAMPLECOVERAGENVPROC$FUNC, "(IIIIIIIB)V");
    }
    static MemoryAddress allocate(PFNGLTEXIMAGE3DMULTISAMPLECOVERAGENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXIMAGE3DMULTISAMPLECOVERAGENVPROC.class, fi, constants$912.PFNGLTEXIMAGE3DMULTISAMPLECOVERAGENVPROC$FUNC, "(IIIIIIIB)V", scope);
    }
    static PFNGLTEXIMAGE3DMULTISAMPLECOVERAGENVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, byte x7) -> {
            try {
                constants$912.PFNGLTEXIMAGE3DMULTISAMPLECOVERAGENVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

