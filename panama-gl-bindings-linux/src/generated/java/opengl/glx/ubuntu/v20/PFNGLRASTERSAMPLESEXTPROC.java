// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLRASTERSAMPLESEXTPROC {

    void apply(int x0, byte x1);
    static MemoryAddress allocate(PFNGLRASTERSAMPLESEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLRASTERSAMPLESEXTPROC.class, fi, constants$739.PFNGLRASTERSAMPLESEXTPROC$FUNC, "(IB)V");
    }
    static MemoryAddress allocate(PFNGLRASTERSAMPLESEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLRASTERSAMPLESEXTPROC.class, fi, constants$739.PFNGLRASTERSAMPLESEXTPROC$FUNC, "(IB)V", scope);
    }
    static PFNGLRASTERSAMPLESEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, byte x1) -> {
            try {
                constants$739.PFNGLRASTERSAMPLESEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


