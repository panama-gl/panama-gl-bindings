// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXGENXVOESPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLTEXGENXVOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXGENXVOESPROC.class, fi, constants$445.PFNGLTEXGENXVOESPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLTEXGENXVOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXGENXVOESPROC.class, fi, constants$445.PFNGLTEXGENXVOESPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLTEXGENXVOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$445.PFNGLTEXGENXVOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


