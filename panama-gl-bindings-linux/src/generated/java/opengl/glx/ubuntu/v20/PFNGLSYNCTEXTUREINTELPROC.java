// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSYNCTEXTUREINTELPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLSYNCTEXTUREINTELPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSYNCTEXTUREINTELPROC.class, fi, constants$790.PFNGLSYNCTEXTUREINTELPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLSYNCTEXTUREINTELPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSYNCTEXTUREINTELPROC.class, fi, constants$790.PFNGLSYNCTEXTUREINTELPROC$FUNC, "(I)V", scope);
    }
    static PFNGLSYNCTEXTUREINTELPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$790.PFNGLSYNCTEXTUREINTELPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


