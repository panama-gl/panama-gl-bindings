// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVIDEOCAPTURESTREAMPARAMETERIVNVPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLVIDEOCAPTURESTREAMPARAMETERIVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVIDEOCAPTURESTREAMPARAMETERIVNVPROC.class, fi, constants$967.PFNGLVIDEOCAPTURESTREAMPARAMETERIVNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLVIDEOCAPTURESTREAMPARAMETERIVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVIDEOCAPTURESTREAMPARAMETERIVNVPROC.class, fi, constants$967.PFNGLVIDEOCAPTURESTREAMPARAMETERIVNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLVIDEOCAPTURESTREAMPARAMETERIVNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$967.PFNGLVIDEOCAPTURESTREAMPARAMETERIVNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

