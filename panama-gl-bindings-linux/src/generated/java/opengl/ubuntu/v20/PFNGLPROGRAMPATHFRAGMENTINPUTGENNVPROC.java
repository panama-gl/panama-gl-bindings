// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC {

    void apply(int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC.class, fi, constants$804.PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC.class, fi, constants$804.PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$804.PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


