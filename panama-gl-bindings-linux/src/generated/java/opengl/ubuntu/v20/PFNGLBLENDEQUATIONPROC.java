// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBLENDEQUATIONPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLBLENDEQUATIONPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBLENDEQUATIONPROC.class, fi, constants$106.PFNGLBLENDEQUATIONPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLBLENDEQUATIONPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBLENDEQUATIONPROC.class, fi, constants$106.PFNGLBLENDEQUATIONPROC$FUNC, "(I)V", scope);
    }
    static PFNGLBLENDEQUATIONPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$106.PFNGLBLENDEQUATIONPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


