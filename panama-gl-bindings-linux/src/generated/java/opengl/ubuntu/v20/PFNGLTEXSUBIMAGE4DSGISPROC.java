// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXSUBIMAGE4DSGISPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9, int x10, int x11, jdk.incubator.foreign.MemoryAddress x12);
    static MemoryAddress allocate(PFNGLTEXSUBIMAGE4DSGISPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXSUBIMAGE4DSGISPROC.class, fi, constants$889.PFNGLTEXSUBIMAGE4DSGISPROC$FUNC, "(IIIIIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLTEXSUBIMAGE4DSGISPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXSUBIMAGE4DSGISPROC.class, fi, constants$889.PFNGLTEXSUBIMAGE4DSGISPROC$FUNC, "(IIIIIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLTEXSUBIMAGE4DSGISPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9, int x10, int x11, jdk.incubator.foreign.MemoryAddress x12) -> {
            try {
                constants$889.PFNGLTEXSUBIMAGE4DSGISPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


