// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETBOOLEANI_VPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETBOOLEANI_VPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETBOOLEANI_VPROC.class, fi, constants$232.PFNGLGETBOOLEANI_VPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETBOOLEANI_VPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETBOOLEANI_VPROC.class, fi, constants$232.PFNGLGETBOOLEANI_VPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETBOOLEANI_VPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$232.PFNGLGETBOOLEANI_VPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

