// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPASSTEXCOORDATIPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLPASSTEXCOORDATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPASSTEXCOORDATIPROC.class, fi, constants$576.PFNGLPASSTEXCOORDATIPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLPASSTEXCOORDATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPASSTEXCOORDATIPROC.class, fi, constants$576.PFNGLPASSTEXCOORDATIPROC$FUNC, "(III)V", scope);
    }
    static PFNGLPASSTEXCOORDATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$576.PFNGLPASSTEXCOORDATIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


