// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIB4NBVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB4NBVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB4NBVPROC.class, fi, constants$223.PFNGLVERTEXATTRIB4NBVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB4NBVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB4NBVPROC.class, fi, constants$223.PFNGLVERTEXATTRIB4NBVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLVERTEXATTRIB4NBVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$223.PFNGLVERTEXATTRIB4NBVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


