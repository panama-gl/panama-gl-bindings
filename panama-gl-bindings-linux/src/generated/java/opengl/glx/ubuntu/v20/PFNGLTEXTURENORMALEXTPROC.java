// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXTURENORMALEXTPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLTEXTURENORMALEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURENORMALEXTPROC.class, fi, constants$757.PFNGLTEXTURENORMALEXTPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLTEXTURENORMALEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURENORMALEXTPROC.class, fi, constants$757.PFNGLTEXTURENORMALEXTPROC$FUNC, "(I)V", scope);
    }
    static PFNGLTEXTURENORMALEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$757.PFNGLTEXTURENORMALEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

