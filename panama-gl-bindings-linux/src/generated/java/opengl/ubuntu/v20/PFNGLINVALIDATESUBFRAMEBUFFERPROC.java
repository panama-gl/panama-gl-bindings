// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLINVALIDATESUBFRAMEBUFFERPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, int x4, int x5, int x6);
    static MemoryAddress allocate(PFNGLINVALIDATESUBFRAMEBUFFERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLINVALIDATESUBFRAMEBUFFERPROC.class, fi, constants$257.PFNGLINVALIDATESUBFRAMEBUFFERPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;IIII)V");
    }
    static MemoryAddress allocate(PFNGLINVALIDATESUBFRAMEBUFFERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLINVALIDATESUBFRAMEBUFFERPROC.class, fi, constants$257.PFNGLINVALIDATESUBFRAMEBUFFERPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;IIII)V", scope);
    }
    static PFNGLINVALIDATESUBFRAMEBUFFERPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, int x4, int x5, int x6) -> {
            try {
                constants$257.PFNGLINVALIDATESUBFRAMEBUFFERPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


