// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETTEXTURELEVELPARAMETERIVPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLGETTEXTURELEVELPARAMETERIVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTURELEVELPARAMETERIVPROC.class, fi, constants$294.PFNGLGETTEXTURELEVELPARAMETERIVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETTEXTURELEVELPARAMETERIVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTURELEVELPARAMETERIVPROC.class, fi, constants$294.PFNGLGETTEXTURELEVELPARAMETERIVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETTEXTURELEVELPARAMETERIVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$294.PFNGLGETTEXTURELEVELPARAMETERIVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


