// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDEBUGMESSAGEINSERTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, jdk.incubator.foreign.MemoryAddress x5);
    static MemoryAddress allocate(PFNGLDEBUGMESSAGEINSERTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDEBUGMESSAGEINSERTPROC.class, fi, constants$264.PFNGLDEBUGMESSAGEINSERTPROC$FUNC, "(IIIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDEBUGMESSAGEINSERTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDEBUGMESSAGEINSERTPROC.class, fi, constants$264.PFNGLDEBUGMESSAGEINSERTPROC$FUNC, "(IIIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDEBUGMESSAGEINSERTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, jdk.incubator.foreign.MemoryAddress x5) -> {
            try {
                constants$264.PFNGLDEBUGMESSAGEINSERTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


