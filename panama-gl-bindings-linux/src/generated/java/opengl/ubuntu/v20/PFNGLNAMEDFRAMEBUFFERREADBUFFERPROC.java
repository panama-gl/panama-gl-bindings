// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC.class, fi, constants$280.PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC.class, fi, constants$280.PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC$FUNC, "(II)V", scope);
    }
    static PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$280.PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

