// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXCOORD4XOESPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLTEXCOORD4XOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD4XOESPROC.class, fi, constants$444.PFNGLTEXCOORD4XOESPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLTEXCOORD4XOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD4XOESPROC.class, fi, constants$444.PFNGLTEXCOORD4XOESPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLTEXCOORD4XOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$444.PFNGLTEXCOORD4XOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


