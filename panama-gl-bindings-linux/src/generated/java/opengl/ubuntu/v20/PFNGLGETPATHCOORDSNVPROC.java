// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETPATHCOORDSNVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGETPATHCOORDSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETPATHCOORDSNVPROC.class, fi, constants$797.PFNGLGETPATHCOORDSNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETPATHCOORDSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETPATHCOORDSNVPROC.class, fi, constants$797.PFNGLGETPATHCOORDSNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETPATHCOORDSNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$797.PFNGLGETPATHCOORDSNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


