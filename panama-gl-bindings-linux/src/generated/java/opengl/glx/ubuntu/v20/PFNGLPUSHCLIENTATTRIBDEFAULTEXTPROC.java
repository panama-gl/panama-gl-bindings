// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC.class, fi, constants$626.PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC.class, fi, constants$626.PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC$FUNC, "(I)V", scope);
    }
    static PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$626.PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


