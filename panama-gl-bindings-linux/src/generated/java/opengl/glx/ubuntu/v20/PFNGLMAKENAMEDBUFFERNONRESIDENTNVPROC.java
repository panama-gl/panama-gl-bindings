// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC.class, fi, constants$906.PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC.class, fi, constants$906.PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC$FUNC, "(I)V", scope);
    }
    static PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$906.PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


