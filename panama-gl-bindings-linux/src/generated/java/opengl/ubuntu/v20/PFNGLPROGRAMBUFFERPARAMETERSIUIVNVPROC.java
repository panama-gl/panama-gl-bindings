// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMBUFFERPARAMETERSIUIVNVPROC {

    void apply(int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLPROGRAMBUFFERPARAMETERSIUIVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMBUFFERPARAMETERSIUIVNVPROC.class, fi, constants$786.PFNGLPROGRAMBUFFERPARAMETERSIUIVNVPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMBUFFERPARAMETERSIUIVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMBUFFERPARAMETERSIUIVNVPROC.class, fi, constants$786.PFNGLPROGRAMBUFFERPARAMETERSIUIVNVPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPROGRAMBUFFERPARAMETERSIUIVNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$786.PFNGLPROGRAMBUFFERPARAMETERSIUIVNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


