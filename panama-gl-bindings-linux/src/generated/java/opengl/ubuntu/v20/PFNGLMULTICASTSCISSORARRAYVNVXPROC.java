// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTICASTSCISSORARRAYVNVXPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLMULTICASTSCISSORARRAYVNVXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTICASTSCISSORARRAYVNVXPROC.class, fi, constants$721.PFNGLMULTICASTSCISSORARRAYVNVXPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLMULTICASTSCISSORARRAYVNVXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTICASTSCISSORARRAYVNVXPROC.class, fi, constants$721.PFNGLMULTICASTSCISSORARRAYVNVXPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLMULTICASTSCISSORARRAYVNVXPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$721.PFNGLMULTICASTSCISSORARRAYVNVXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


