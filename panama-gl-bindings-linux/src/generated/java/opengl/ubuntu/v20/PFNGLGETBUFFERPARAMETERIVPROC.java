// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETBUFFERPARAMETERIVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETBUFFERPARAMETERIVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETBUFFERPARAMETERIVPROC.class, fi, constants$112.PFNGLGETBUFFERPARAMETERIVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETBUFFERPARAMETERIVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETBUFFERPARAMETERIVPROC.class, fi, constants$112.PFNGLGETBUFFERPARAMETERIVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETBUFFERPARAMETERIVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$112.PFNGLGETBUFFERPARAMETERIVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


