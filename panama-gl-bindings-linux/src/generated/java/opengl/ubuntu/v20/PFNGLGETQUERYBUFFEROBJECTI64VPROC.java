// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETQUERYBUFFEROBJECTI64VPROC {

    void apply(int x0, int x1, int x2, long x3);
    static MemoryAddress allocate(PFNGLGETQUERYBUFFEROBJECTI64VPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETQUERYBUFFEROBJECTI64VPROC.class, fi, constants$301.PFNGLGETQUERYBUFFEROBJECTI64VPROC$FUNC, "(IIIJ)V");
    }
    static MemoryAddress allocate(PFNGLGETQUERYBUFFEROBJECTI64VPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETQUERYBUFFEROBJECTI64VPROC.class, fi, constants$301.PFNGLGETQUERYBUFFEROBJECTI64VPROC$FUNC, "(IIIJ)V", scope);
    }
    static PFNGLGETQUERYBUFFEROBJECTI64VPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, long x3) -> {
            try {
                constants$301.PFNGLGETQUERYBUFFEROBJECTI64VPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


