// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3, int x4);
    static MemoryAddress allocate(PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROC.class, fi, constants$832.PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)V");
    }
    static MemoryAddress allocate(PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROC.class, fi, constants$832.PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3, int x4) -> {
            try {
                constants$832.PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


