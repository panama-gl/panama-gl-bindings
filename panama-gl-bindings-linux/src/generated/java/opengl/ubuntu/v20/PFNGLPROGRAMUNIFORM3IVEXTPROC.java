// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPROGRAMUNIFORM3IVEXTPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM3IVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3IVEXTPROC.class, fi, constants$577.PFNGLPROGRAMUNIFORM3IVEXTPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLPROGRAMUNIFORM3IVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROGRAMUNIFORM3IVEXTPROC.class, fi, constants$577.PFNGLPROGRAMUNIFORM3IVEXTPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLPROGRAMUNIFORM3IVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$577.PFNGLPROGRAMUNIFORM3IVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

