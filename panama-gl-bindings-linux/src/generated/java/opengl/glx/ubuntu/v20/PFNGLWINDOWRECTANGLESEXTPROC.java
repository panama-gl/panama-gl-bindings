// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLWINDOWRECTANGLESEXTPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLWINDOWRECTANGLESEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWRECTANGLESEXTPROC.class, fi, constants$783.PFNGLWINDOWRECTANGLESEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLWINDOWRECTANGLESEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWINDOWRECTANGLESEXTPROC.class, fi, constants$783.PFNGLWINDOWRECTANGLESEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLWINDOWRECTANGLESEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$783.PFNGLWINDOWRECTANGLESEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


