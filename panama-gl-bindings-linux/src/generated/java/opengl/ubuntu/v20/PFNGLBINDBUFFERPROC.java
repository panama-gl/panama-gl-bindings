// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBINDBUFFERPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLBINDBUFFERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDBUFFERPROC.class, fi, constants$109.PFNGLBINDBUFFERPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLBINDBUFFERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDBUFFERPROC.class, fi, constants$109.PFNGLBINDBUFFERPROC$FUNC, "(II)V", scope);
    }
    static PFNGLBINDBUFFERPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$109.PFNGLBINDBUFFERPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


