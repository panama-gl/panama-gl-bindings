// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSIGNALVKFENCENVPROC {

    void apply(long x0);
    static MemoryAddress allocate(PFNGLSIGNALVKFENCENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSIGNALVKFENCENVPROC.class, fi, constants$828.PFNGLSIGNALVKFENCENVPROC$FUNC, "(J)V");
    }
    static MemoryAddress allocate(PFNGLSIGNALVKFENCENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSIGNALVKFENCENVPROC.class, fi, constants$828.PFNGLSIGNALVKFENCENVPROC$FUNC, "(J)V", scope);
    }
    static PFNGLSIGNALVKFENCENVPROC ofAddress(MemoryAddress addr) {
        return (long x0) -> {
            try {
                constants$828.PFNGLSIGNALVKFENCENVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


