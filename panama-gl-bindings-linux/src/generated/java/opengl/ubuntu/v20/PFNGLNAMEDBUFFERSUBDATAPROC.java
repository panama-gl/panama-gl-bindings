// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLNAMEDBUFFERSUBDATAPROC {

    void apply(int x0, long x1, long x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLNAMEDBUFFERSUBDATAPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDBUFFERSUBDATAPROC.class, fi, constants$273.PFNGLNAMEDBUFFERSUBDATAPROC$FUNC, "(IJJLjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDBUFFERSUBDATAPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDBUFFERSUBDATAPROC.class, fi, constants$273.PFNGLNAMEDBUFFERSUBDATAPROC$FUNC, "(IJJLjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLNAMEDBUFFERSUBDATAPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, long x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$273.PFNGLNAMEDBUFFERSUBDATAPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


