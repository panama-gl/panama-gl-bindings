// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCLIPCONTROLPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLCLIPCONTROLPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCLIPCONTROLPROC.class, fi, constants$270.PFNGLCLIPCONTROLPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLCLIPCONTROLPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCLIPCONTROLPROC.class, fi, constants$270.PFNGLCLIPCONTROLPROC$FUNC, "(II)V", scope);
    }
    static PFNGLCLIPCONTROLPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$270.PFNGLCLIPCONTROLPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


