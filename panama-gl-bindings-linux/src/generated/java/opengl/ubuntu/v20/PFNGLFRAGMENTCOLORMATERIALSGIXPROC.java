// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFRAGMENTCOLORMATERIALSGIXPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLFRAGMENTCOLORMATERIALSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTCOLORMATERIALSGIXPROC.class, fi, constants$893.PFNGLFRAGMENTCOLORMATERIALSGIXPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLFRAGMENTCOLORMATERIALSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTCOLORMATERIALSGIXPROC.class, fi, constants$893.PFNGLFRAGMENTCOLORMATERIALSGIXPROC$FUNC, "(II)V", scope);
    }
    static PFNGLFRAGMENTCOLORMATERIALSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$893.PFNGLFRAGMENTCOLORMATERIALSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


