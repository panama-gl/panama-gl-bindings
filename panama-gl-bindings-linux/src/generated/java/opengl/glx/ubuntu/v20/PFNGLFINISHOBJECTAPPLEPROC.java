// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFINISHOBJECTAPPLEPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLFINISHOBJECTAPPLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFINISHOBJECTAPPLEPROC.class, fi, constants$564.PFNGLFINISHOBJECTAPPLEPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLFINISHOBJECTAPPLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFINISHOBJECTAPPLEPROC.class, fi, constants$564.PFNGLFINISHOBJECTAPPLEPROC$FUNC, "(II)V", scope);
    }
    static PFNGLFINISHOBJECTAPPLEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$564.PFNGLFINISHOBJECTAPPLEPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

