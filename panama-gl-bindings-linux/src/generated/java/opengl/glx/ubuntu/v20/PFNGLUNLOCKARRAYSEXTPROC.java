// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLUNLOCKARRAYSEXTPROC {

    void apply();
    static MemoryAddress allocate(PFNGLUNLOCKARRAYSEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNLOCKARRAYSEXTPROC.class, fi, constants$605.PFNGLUNLOCKARRAYSEXTPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLUNLOCKARRAYSEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNLOCKARRAYSEXTPROC.class, fi, constants$605.PFNGLUNLOCKARRAYSEXTPROC$FUNC, "()V", scope);
    }
    static PFNGLUNLOCKARRAYSEXTPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$605.PFNGLUNLOCKARRAYSEXTPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


