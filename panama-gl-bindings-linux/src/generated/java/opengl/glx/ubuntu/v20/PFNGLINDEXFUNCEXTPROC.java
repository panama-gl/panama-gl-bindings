// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLINDEXFUNCEXTPROC {

    void apply(int x0, float x1);
    static MemoryAddress allocate(PFNGLINDEXFUNCEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLINDEXFUNCEXTPROC.class, fi, constants$724.PFNGLINDEXFUNCEXTPROC$FUNC, "(IF)V");
    }
    static MemoryAddress allocate(PFNGLINDEXFUNCEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLINDEXFUNCEXTPROC.class, fi, constants$724.PFNGLINDEXFUNCEXTPROC$FUNC, "(IF)V", scope);
    }
    static PFNGLINDEXFUNCEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1) -> {
            try {
                constants$724.PFNGLINDEXFUNCEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


