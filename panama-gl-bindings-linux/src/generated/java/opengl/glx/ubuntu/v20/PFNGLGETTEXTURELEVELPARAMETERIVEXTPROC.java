// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETTEXTURELEVELPARAMETERIVEXTPROC {

    void apply(int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLGETTEXTURELEVELPARAMETERIVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTURELEVELPARAMETERIVEXTPROC.class, fi, constants$632.PFNGLGETTEXTURELEVELPARAMETERIVEXTPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETTEXTURELEVELPARAMETERIVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTURELEVELPARAMETERIVEXTPROC.class, fi, constants$632.PFNGLGETTEXTURELEVELPARAMETERIVEXTPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETTEXTURELEVELPARAMETERIVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$632.PFNGLGETTEXTURELEVELPARAMETERIVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


