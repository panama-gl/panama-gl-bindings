// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOLORP3UIPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLCOLORP3UIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOLORP3UIPROC.class, fi, constants$287.PFNGLCOLORP3UIPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLCOLORP3UIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOLORP3UIPROC.class, fi, constants$287.PFNGLCOLORP3UIPROC$FUNC, "(II)V", scope);
    }
    static PFNGLCOLORP3UIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$287.PFNGLCOLORP3UIPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


