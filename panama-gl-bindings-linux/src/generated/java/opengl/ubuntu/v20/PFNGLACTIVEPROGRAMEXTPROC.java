// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLACTIVEPROGRAMEXTPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLACTIVEPROGRAMEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLACTIVEPROGRAMEXTPROC.class, fi, constants$664.PFNGLACTIVEPROGRAMEXTPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLACTIVEPROGRAMEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLACTIVEPROGRAMEXTPROC.class, fi, constants$664.PFNGLACTIVEPROGRAMEXTPROC$FUNC, "(I)V", scope);
    }
    static PFNGLACTIVEPROGRAMEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$664.PFNGLACTIVEPROGRAMEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


