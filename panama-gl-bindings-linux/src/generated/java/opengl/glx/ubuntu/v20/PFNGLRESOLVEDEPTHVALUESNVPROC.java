// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLRESOLVEDEPTHVALUESNVPROC {

    void apply();
    static MemoryAddress allocate(PFNGLRESOLVEDEPTHVALUESNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLRESOLVEDEPTHVALUESNVPROC.class, fi, constants$904.PFNGLRESOLVEDEPTHVALUESNVPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLRESOLVEDEPTHVALUESNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLRESOLVEDEPTHVALUESNVPROC.class, fi, constants$904.PFNGLRESOLVEDEPTHVALUESNVPROC$FUNC, "()V", scope);
    }
    static PFNGLRESOLVEDEPTHVALUESNVPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$904.PFNGLRESOLVEDEPTHVALUESNVPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


