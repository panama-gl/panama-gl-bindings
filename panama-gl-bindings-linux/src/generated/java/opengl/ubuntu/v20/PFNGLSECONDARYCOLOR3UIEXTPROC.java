// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSECONDARYCOLOR3UIEXTPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3UIEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3UIEXTPROC.class, fi, constants$658.PFNGLSECONDARYCOLOR3UIEXTPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3UIEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3UIEXTPROC.class, fi, constants$658.PFNGLSECONDARYCOLOR3UIEXTPROC$FUNC, "(III)V", scope);
    }
    static PFNGLSECONDARYCOLOR3UIEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$658.PFNGLSECONDARYCOLOR3UIEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


