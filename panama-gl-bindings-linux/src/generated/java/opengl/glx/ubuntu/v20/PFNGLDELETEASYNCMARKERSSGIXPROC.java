// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDELETEASYNCMARKERSSGIXPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLDELETEASYNCMARKERSSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETEASYNCMARKERSSGIXPROC.class, fi, constants$977.PFNGLDELETEASYNCMARKERSSGIXPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLDELETEASYNCMARKERSSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETEASYNCMARKERSSGIXPROC.class, fi, constants$977.PFNGLDELETEASYNCMARKERSSGIXPROC$FUNC, "(II)V", scope);
    }
    static PFNGLDELETEASYNCMARKERSSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$977.PFNGLDELETEASYNCMARKERSSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


