// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETACTIVEUNIFORMSIVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLGETACTIVEUNIFORMSIVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETACTIVEUNIFORMSIVPROC.class, fi, constants$176.PFNGLGETACTIVEUNIFORMSIVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETACTIVEUNIFORMSIVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETACTIVEUNIFORMSIVPROC.class, fi, constants$176.PFNGLGETACTIVEUNIFORMSIVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETACTIVEUNIFORMSIVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$176.PFNGLGETACTIVEUNIFORMSIVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

