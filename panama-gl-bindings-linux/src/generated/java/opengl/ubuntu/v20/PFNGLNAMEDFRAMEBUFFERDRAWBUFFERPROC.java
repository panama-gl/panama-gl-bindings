// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC.class, fi, constants$279.PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC.class, fi, constants$279.PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC$FUNC, "(II)V", scope);
    }
    static PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$279.PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

