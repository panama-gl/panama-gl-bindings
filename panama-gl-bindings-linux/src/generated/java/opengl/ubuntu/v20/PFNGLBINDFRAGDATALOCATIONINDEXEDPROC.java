// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBINDFRAGDATALOCATIONINDEXEDPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLBINDFRAGDATALOCATIONINDEXEDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDFRAGDATALOCATIONINDEXEDPROC.class, fi, constants$184.PFNGLBINDFRAGDATALOCATIONINDEXEDPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLBINDFRAGDATALOCATIONINDEXEDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDFRAGDATALOCATIONINDEXEDPROC.class, fi, constants$184.PFNGLBINDFRAGDATALOCATIONINDEXEDPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLBINDFRAGDATALOCATIONINDEXEDPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$184.PFNGLBINDFRAGDATALOCATIONINDEXEDPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


