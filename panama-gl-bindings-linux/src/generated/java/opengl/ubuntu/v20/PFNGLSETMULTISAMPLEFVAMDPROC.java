// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSETMULTISAMPLEFVAMDPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLSETMULTISAMPLEFVAMDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSETMULTISAMPLEFVAMDPROC.class, fi, constants$473.PFNGLSETMULTISAMPLEFVAMDPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLSETMULTISAMPLEFVAMDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSETMULTISAMPLEFVAMDPROC.class, fi, constants$473.PFNGLSETMULTISAMPLEFVAMDPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLSETMULTISAMPLEFVAMDPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$473.PFNGLSETMULTISAMPLEFVAMDPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


