// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIBI1UIEXTPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBI1UIEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI1UIEXTPROC.class, fi, constants$957.PFNGLVERTEXATTRIBI1UIEXTPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBI1UIEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI1UIEXTPROC.class, fi, constants$957.PFNGLVERTEXATTRIBI1UIEXTPROC$FUNC, "(II)V", scope);
    }
    static PFNGLVERTEXATTRIBI1UIEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$957.PFNGLVERTEXATTRIBI1UIEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

