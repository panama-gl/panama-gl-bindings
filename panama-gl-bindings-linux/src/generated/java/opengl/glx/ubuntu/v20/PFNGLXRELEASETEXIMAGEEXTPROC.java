// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLXRELEASETEXIMAGEEXTPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0, long x1, int x2);
    static MemoryAddress allocate(PFNGLXRELEASETEXIMAGEEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLXRELEASETEXIMAGEEXTPROC.class, fi, constants$1034.PFNGLXRELEASETEXIMAGEEXTPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JI)V");
    }
    static MemoryAddress allocate(PFNGLXRELEASETEXIMAGEEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLXRELEASETEXIMAGEEXTPROC.class, fi, constants$1034.PFNGLXRELEASETEXIMAGEEXTPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JI)V", scope);
    }
    static PFNGLXRELEASETEXIMAGEEXTPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, long x1, int x2) -> {
            try {
                constants$1034.PFNGLXRELEASETEXIMAGEEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

