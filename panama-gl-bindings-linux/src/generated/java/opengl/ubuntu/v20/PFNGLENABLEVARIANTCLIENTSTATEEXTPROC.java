// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLENABLEVARIANTCLIENTSTATEEXTPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLENABLEVARIANTCLIENTSTATEEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLENABLEVARIANTCLIENTSTATEEXTPROC.class, fi, constants$690.PFNGLENABLEVARIANTCLIENTSTATEEXTPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLENABLEVARIANTCLIENTSTATEEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLENABLEVARIANTCLIENTSTATEEXTPROC.class, fi, constants$690.PFNGLENABLEVARIANTCLIENTSTATEEXTPROC$FUNC, "(I)V", scope);
    }
    static PFNGLENABLEVARIANTCLIENTSTATEEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$690.PFNGLENABLEVARIANTCLIENTSTATEEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

