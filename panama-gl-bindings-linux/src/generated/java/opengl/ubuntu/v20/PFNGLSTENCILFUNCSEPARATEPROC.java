// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSTENCILFUNCSEPARATEPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLSTENCILFUNCSEPARATEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILFUNCSEPARATEPROC.class, fi, constants$114.PFNGLSTENCILFUNCSEPARATEPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLSTENCILFUNCSEPARATEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILFUNCSEPARATEPROC.class, fi, constants$114.PFNGLSTENCILFUNCSEPARATEPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLSTENCILFUNCSEPARATEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$114.PFNGLSTENCILFUNCSEPARATEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


