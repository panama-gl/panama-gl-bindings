// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCLEARBUFFERFVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLCLEARBUFFERFVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCLEARBUFFERFVPROC.class, fi, constants$250.PFNGLCLEARBUFFERFVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCLEARBUFFERFVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCLEARBUFFERFVPROC.class, fi, constants$250.PFNGLCLEARBUFFERFVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCLEARBUFFERFVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$250.PFNGLCLEARBUFFERFVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


