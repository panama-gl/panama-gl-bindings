// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGENERATEMIPMAPPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLGENERATEMIPMAPPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGENERATEMIPMAPPROC.class, fi, constants$171.PFNGLGENERATEMIPMAPPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLGENERATEMIPMAPPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGENERATEMIPMAPPROC.class, fi, constants$171.PFNGLGENERATEMIPMAPPROC$FUNC, "(I)V", scope);
    }
    static PFNGLGENERATEMIPMAPPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$171.PFNGLGENERATEMIPMAPPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


