// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLISENABLEDINDEXEDEXTPROC {

    byte apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLISENABLEDINDEXEDEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISENABLEDINDEXEDEXTPROC.class, fi, constants$648.PFNGLISENABLEDINDEXEDEXTPROC$FUNC, "(II)B");
    }
    static MemoryAddress allocate(PFNGLISENABLEDINDEXEDEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISENABLEDINDEXEDEXTPROC.class, fi, constants$648.PFNGLISENABLEDINDEXEDEXTPROC$FUNC, "(II)B", scope);
    }
    static PFNGLISENABLEDINDEXEDEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                return (byte)constants$648.PFNGLISENABLEDINDEXEDEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


