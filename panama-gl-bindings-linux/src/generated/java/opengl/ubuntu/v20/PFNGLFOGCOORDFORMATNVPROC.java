// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFOGCOORDFORMATNVPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLFOGCOORDFORMATNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFOGCOORDFORMATNVPROC.class, fi, constants$848.PFNGLFOGCOORDFORMATNVPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLFOGCOORDFORMATNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFOGCOORDFORMATNVPROC.class, fi, constants$848.PFNGLFOGCOORDFORMATNVPROC$FUNC, "(II)V", scope);
    }
    static PFNGLFOGCOORDFORMATNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$848.PFNGLFOGCOORDFORMATNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


