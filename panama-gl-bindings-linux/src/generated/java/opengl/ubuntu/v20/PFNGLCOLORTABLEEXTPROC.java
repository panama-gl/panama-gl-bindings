// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOLORTABLEEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, jdk.incubator.foreign.MemoryAddress x5);
    static MemoryAddress allocate(PFNGLCOLORTABLEEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOLORTABLEEXTPROC.class, fi, constants$649.PFNGLCOLORTABLEEXTPROC$FUNC, "(IIIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCOLORTABLEEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOLORTABLEEXTPROC.class, fi, constants$649.PFNGLCOLORTABLEEXTPROC$FUNC, "(IIIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCOLORTABLEEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, jdk.incubator.foreign.MemoryAddress x5) -> {
            try {
                constants$649.PFNGLCOLORTABLEEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


