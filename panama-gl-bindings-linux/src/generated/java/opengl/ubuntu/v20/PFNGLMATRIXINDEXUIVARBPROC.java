// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMATRIXINDEXUIVARBPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLMATRIXINDEXUIVARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXINDEXUIVARBPROC.class, fi, constants$345.PFNGLMATRIXINDEXUIVARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLMATRIXINDEXUIVARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXINDEXUIVARBPROC.class, fi, constants$345.PFNGLMATRIXINDEXUIVARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLMATRIXINDEXUIVARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$345.PFNGLMATRIXINDEXUIVARBPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


