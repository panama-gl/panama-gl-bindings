// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOLORMASKINDEXEDEXTPROC {

    void apply(int x0, byte x1, byte x2, byte x3, byte x4);
    static MemoryAddress allocate(PFNGLCOLORMASKINDEXEDEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOLORMASKINDEXEDEXTPROC.class, fi, constants$621.PFNGLCOLORMASKINDEXEDEXTPROC$FUNC, "(IBBBB)V");
    }
    static MemoryAddress allocate(PFNGLCOLORMASKINDEXEDEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOLORMASKINDEXEDEXTPROC.class, fi, constants$621.PFNGLCOLORMASKINDEXEDEXTPROC$FUNC, "(IBBBB)V", scope);
    }
    static PFNGLCOLORMASKINDEXEDEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, byte x1, byte x2, byte x3, byte x4) -> {
            try {
                constants$621.PFNGLCOLORMASKINDEXEDEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


