// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFRAGMENTLIGHTIVSGIXPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLFRAGMENTLIGHTIVSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTLIGHTIVSGIXPROC.class, fi, constants$894.PFNGLFRAGMENTLIGHTIVSGIXPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLFRAGMENTLIGHTIVSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTLIGHTIVSGIXPROC.class, fi, constants$894.PFNGLFRAGMENTLIGHTIVSGIXPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLFRAGMENTLIGHTIVSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$894.PFNGLFRAGMENTLIGHTIVSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

