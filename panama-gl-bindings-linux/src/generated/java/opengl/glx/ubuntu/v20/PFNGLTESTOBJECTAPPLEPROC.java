// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTESTOBJECTAPPLEPROC {

    byte apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLTESTOBJECTAPPLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTESTOBJECTAPPLEPROC.class, fi, constants$564.PFNGLTESTOBJECTAPPLEPROC$FUNC, "(II)B");
    }
    static MemoryAddress allocate(PFNGLTESTOBJECTAPPLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTESTOBJECTAPPLEPROC.class, fi, constants$564.PFNGLTESTOBJECTAPPLEPROC$FUNC, "(II)B", scope);
    }
    static PFNGLTESTOBJECTAPPLEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                return (byte)constants$564.PFNGLTESTOBJECTAPPLEPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


