// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTICASTBARRIERNVPROC {

    void apply();
    static MemoryAddress allocate(PFNGLMULTICASTBARRIERNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTICASTBARRIERNVPROC.class, fi, constants$756.PFNGLMULTICASTBARRIERNVPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLMULTICASTBARRIERNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTICASTBARRIERNVPROC.class, fi, constants$756.PFNGLMULTICASTBARRIERNVPROC$FUNC, "()V", scope);
    }
    static PFNGLMULTICASTBARRIERNVPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$756.PFNGLMULTICASTBARRIERNVPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


