// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLISPOINTINFILLPATHNVPROC {

    byte apply(int x0, int x1, float x2, float x3);
    static MemoryAddress allocate(PFNGLISPOINTINFILLPATHNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISPOINTINFILLPATHNVPROC.class, fi, constants$799.PFNGLISPOINTINFILLPATHNVPROC$FUNC, "(IIFF)B");
    }
    static MemoryAddress allocate(PFNGLISPOINTINFILLPATHNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISPOINTINFILLPATHNVPROC.class, fi, constants$799.PFNGLISPOINTINFILLPATHNVPROC$FUNC, "(IIFF)B", scope);
    }
    static PFNGLISPOINTINFILLPATHNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, float x2, float x3) -> {
            try {
                return (byte)constants$799.PFNGLISPOINTINFILLPATHNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


