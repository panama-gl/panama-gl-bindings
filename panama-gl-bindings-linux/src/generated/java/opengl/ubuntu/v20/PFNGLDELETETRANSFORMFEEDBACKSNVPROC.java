// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDELETETRANSFORMFEEDBACKSNVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLDELETETRANSFORMFEEDBACKSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETETRANSFORMFEEDBACKSNVPROC.class, fi, constants$833.PFNGLDELETETRANSFORMFEEDBACKSNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDELETETRANSFORMFEEDBACKSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETETRANSFORMFEEDBACKSNVPROC.class, fi, constants$833.PFNGLDELETETRANSFORMFEEDBACKSNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDELETETRANSFORMFEEDBACKSNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$833.PFNGLDELETETRANSFORMFEEDBACKSNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


