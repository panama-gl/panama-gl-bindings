// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLENDVERTEXSHADEREXTPROC {

    void apply();
    static MemoryAddress allocate(PFNGLENDVERTEXSHADEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLENDVERTEXSHADEREXTPROC.class, fi, constants$682.PFNGLENDVERTEXSHADEREXTPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLENDVERTEXSHADEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLENDVERTEXSHADEREXTPROC.class, fi, constants$682.PFNGLENDVERTEXSHADEREXTPROC$FUNC, "()V", scope);
    }
    static PFNGLENDVERTEXSHADEREXTPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$682.PFNGLENDVERTEXSHADEREXTPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


