// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBINDTEXTUREEXTPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLBINDTEXTUREEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDTEXTUREEXTPROC.class, fi, constants$670.PFNGLBINDTEXTUREEXTPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLBINDTEXTUREEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDTEXTUREEXTPROC.class, fi, constants$670.PFNGLBINDTEXTUREEXTPROC$FUNC, "(II)V", scope);
    }
    static PFNGLBINDTEXTUREEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$670.PFNGLBINDTEXTUREEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


