// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC.class, fi, constants$810.PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC.class, fi, constants$810.PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC$FUNC, "(I)V", scope);
    }
    static PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$810.PFNGLALPHATOCOVERAGEDITHERCONTROLNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


