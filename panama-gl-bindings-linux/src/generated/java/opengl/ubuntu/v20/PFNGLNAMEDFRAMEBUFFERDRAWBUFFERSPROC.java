// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC.class, fi, constants$279.PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC.class, fi, constants$279.PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$279.PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


