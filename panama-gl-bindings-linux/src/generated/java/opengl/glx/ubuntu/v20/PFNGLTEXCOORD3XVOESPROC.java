// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXCOORD3XVOESPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLTEXCOORD3XVOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD3XVOESPROC.class, fi, constants$529.PFNGLTEXCOORD3XVOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLTEXCOORD3XVOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXCOORD3XVOESPROC.class, fi, constants$529.PFNGLTEXCOORD3XVOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLTEXCOORD3XVOESPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$529.PFNGLTEXCOORD3XVOESPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


