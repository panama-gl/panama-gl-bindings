// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETNUNIFORMDVPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLGETNUNIFORMDVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETNUNIFORMDVPROC.class, fi, constants$390.PFNGLGETNUNIFORMDVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETNUNIFORMDVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETNUNIFORMDVPROC.class, fi, constants$390.PFNGLGETNUNIFORMDVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETNUNIFORMDVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$390.PFNGLGETNUNIFORMDVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


