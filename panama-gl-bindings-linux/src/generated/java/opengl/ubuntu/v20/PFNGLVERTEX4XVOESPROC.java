// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEX4XVOESPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLVERTEX4XVOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEX4XVOESPROC.class, fi, constants$447.PFNGLVERTEX4XVOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLVERTEX4XVOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEX4XVOESPROC.class, fi, constants$447.PFNGLVERTEX4XVOESPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLVERTEX4XVOESPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$447.PFNGLVERTEX4XVOESPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


