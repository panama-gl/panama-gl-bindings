// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFRAGMENTCOVERAGECOLORNVPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLFRAGMENTCOVERAGECOLORNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTCOVERAGECOLORNVPROC.class, fi, constants$749.PFNGLFRAGMENTCOVERAGECOLORNVPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLFRAGMENTCOVERAGECOLORNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTCOVERAGECOLORNVPROC.class, fi, constants$749.PFNGLFRAGMENTCOVERAGECOLORNVPROC$FUNC, "(I)V", scope);
    }
    static PFNGLFRAGMENTCOVERAGECOLORNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$749.PFNGLFRAGMENTCOVERAGECOLORNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


