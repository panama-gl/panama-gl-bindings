// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFOGCOORDHVNVPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLFOGCOORDHVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFOGCOORDHVNVPROC.class, fi, constants$773.PFNGLFOGCOORDHVNVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLFOGCOORDHVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFOGCOORDHVNVPROC.class, fi, constants$773.PFNGLFOGCOORDHVNVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLFOGCOORDHVNVPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$773.PFNGLFOGCOORDHVNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


