// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSECONDARYCOLOR3IVEXTPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3IVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3IVEXTPROC.class, fi, constants$742.PFNGLSECONDARYCOLOR3IVEXTPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3IVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3IVEXTPROC.class, fi, constants$742.PFNGLSECONDARYCOLOR3IVEXTPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLSECONDARYCOLOR3IVEXTPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$742.PFNGLSECONDARYCOLOR3IVEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


