// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVARIANTUBVEXTPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLVARIANTUBVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVARIANTUBVEXTPROC.class, fi, constants$688.PFNGLVARIANTUBVEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLVARIANTUBVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVARIANTUBVEXTPROC.class, fi, constants$688.PFNGLVARIANTUBVEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLVARIANTUBVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$688.PFNGLVARIANTUBVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

