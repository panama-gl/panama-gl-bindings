// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLPAUSETRANSFORMFEEDBACKNVPROC {

    void apply();
    static MemoryAddress allocate(PFNGLPAUSETRANSFORMFEEDBACKNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPAUSETRANSFORMFEEDBACKNVPROC.class, fi, constants$834.PFNGLPAUSETRANSFORMFEEDBACKNVPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLPAUSETRANSFORMFEEDBACKNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPAUSETRANSFORMFEEDBACKNVPROC.class, fi, constants$834.PFNGLPAUSETRANSFORMFEEDBACKNVPROC$FUNC, "()V", scope);
    }
    static PFNGLPAUSETRANSFORMFEEDBACKNVPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$834.PFNGLPAUSETRANSFORMFEEDBACKNVPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


