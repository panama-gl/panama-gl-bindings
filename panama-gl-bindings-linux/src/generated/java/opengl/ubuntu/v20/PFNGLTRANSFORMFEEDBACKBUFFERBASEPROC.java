// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC.class, fi, constants$271.PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC.class, fi, constants$271.PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC$FUNC, "(III)V", scope);
    }
    static PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$271.PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


