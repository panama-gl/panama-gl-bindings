// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETVERTEXATTRIBLUI64VARBPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETVERTEXATTRIBLUI64VARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETVERTEXATTRIBLUI64VARBPROC.class, fi, constants$317.PFNGLGETVERTEXATTRIBLUI64VARBPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETVERTEXATTRIBLUI64VARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETVERTEXATTRIBLUI64VARBPROC.class, fi, constants$317.PFNGLGETVERTEXATTRIBLUI64VARBPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETVERTEXATTRIBLUI64VARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$317.PFNGLGETVERTEXATTRIBLUI64VARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


