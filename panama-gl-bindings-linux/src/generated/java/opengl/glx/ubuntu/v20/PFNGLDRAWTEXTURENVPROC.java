// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDRAWTEXTURENVPROC {

    void apply(int x0, int x1, float x2, float x3, float x4, float x5, float x6, float x7, float x8, float x9, float x10);
    static MemoryAddress allocate(PFNGLDRAWTEXTURENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDRAWTEXTURENVPROC.class, fi, constants$826.PFNGLDRAWTEXTURENVPROC$FUNC, "(IIFFFFFFFFF)V");
    }
    static MemoryAddress allocate(PFNGLDRAWTEXTURENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDRAWTEXTURENVPROC.class, fi, constants$826.PFNGLDRAWTEXTURENVPROC$FUNC, "(IIFFFFFFFFF)V", scope);
    }
    static PFNGLDRAWTEXTURENVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, float x2, float x3, float x4, float x5, float x6, float x7, float x8, float x9, float x10) -> {
            try {
                constants$826.PFNGLDRAWTEXTURENVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

