// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTIDRAWRANGEELEMENTARRAYAPPLEPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, int x5);
    static MemoryAddress allocate(PFNGLMULTIDRAWRANGEELEMENTARRAYAPPLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWRANGEELEMENTARRAYAPPLEPROC.class, fi, constants$476.PFNGLMULTIDRAWRANGEELEMENTARRAYAPPLEPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V");
    }
    static MemoryAddress allocate(PFNGLMULTIDRAWRANGEELEMENTARRAYAPPLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWRANGEELEMENTARRAYAPPLEPROC.class, fi, constants$476.PFNGLMULTIDRAWRANGEELEMENTARRAYAPPLEPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static PFNGLMULTIDRAWRANGEELEMENTARRAYAPPLEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, int x5) -> {
            try {
                constants$476.PFNGLMULTIDRAWRANGEELEMENTARRAYAPPLEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


