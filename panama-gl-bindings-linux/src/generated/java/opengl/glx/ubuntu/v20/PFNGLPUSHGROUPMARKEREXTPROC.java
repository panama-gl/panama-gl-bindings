// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPUSHGROUPMARKEREXTPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLPUSHGROUPMARKEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPUSHGROUPMARKEREXTPROC.class, fi, constants$620.PFNGLPUSHGROUPMARKEREXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPUSHGROUPMARKEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPUSHGROUPMARKEREXTPROC.class, fi, constants$620.PFNGLPUSHGROUPMARKEREXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPUSHGROUPMARKEREXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$620.PFNGLPUSHGROUPMARKEREXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


