// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLENDVIDEOCAPTURENVPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLENDVIDEOCAPTURENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLENDVIDEOCAPTURENVPROC.class, fi, constants$879.PFNGLENDVIDEOCAPTURENVPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLENDVIDEOCAPTURENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLENDVIDEOCAPTURENVPROC.class, fi, constants$879.PFNGLENDVIDEOCAPTURENVPROC$FUNC, "(I)V", scope);
    }
    static PFNGLENDVIDEOCAPTURENVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$879.PFNGLENDVIDEOCAPTURENVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


