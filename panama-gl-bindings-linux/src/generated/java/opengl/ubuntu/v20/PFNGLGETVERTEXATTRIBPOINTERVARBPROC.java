// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETVERTEXATTRIBPOINTERVARBPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETVERTEXATTRIBPOINTERVARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETVERTEXATTRIBPOINTERVARBPROC.class, fi, constants$399.PFNGLGETVERTEXATTRIBPOINTERVARBPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETVERTEXATTRIBPOINTERVARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETVERTEXATTRIBPOINTERVARBPROC.class, fi, constants$399.PFNGLGETVERTEXATTRIBPOINTERVARBPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETVERTEXATTRIBPOINTERVARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$399.PFNGLGETVERTEXATTRIBPOINTERVARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


