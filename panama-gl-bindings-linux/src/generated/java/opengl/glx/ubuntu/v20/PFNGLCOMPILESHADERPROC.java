// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCOMPILESHADERPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLCOMPILESHADERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOMPILESHADERPROC.class, fi, constants$201.PFNGLCOMPILESHADERPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLCOMPILESHADERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOMPILESHADERPROC.class, fi, constants$201.PFNGLCOMPILESHADERPROC$FUNC, "(I)V", scope);
    }
    static PFNGLCOMPILESHADERPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$201.PFNGLCOMPILESHADERPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


