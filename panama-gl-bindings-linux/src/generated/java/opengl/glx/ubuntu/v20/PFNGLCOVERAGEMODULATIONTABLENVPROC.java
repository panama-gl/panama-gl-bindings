// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOVERAGEMODULATIONTABLENVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLCOVERAGEMODULATIONTABLENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOVERAGEMODULATIONTABLENVPROC.class, fi, constants$837.PFNGLCOVERAGEMODULATIONTABLENVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCOVERAGEMODULATIONTABLENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOVERAGEMODULATIONTABLENVPROC.class, fi, constants$837.PFNGLCOVERAGEMODULATIONTABLENVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCOVERAGEMODULATIONTABLENVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$837.PFNGLCOVERAGEMODULATIONTABLENVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


