// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTIDRAWARRAYSINDIRECTPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLMULTIDRAWARRAYSINDIRECTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWARRAYSINDIRECTPROC.class, fi, constants$343.PFNGLMULTIDRAWARRAYSINDIRECTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;II)V");
    }
    static MemoryAddress allocate(PFNGLMULTIDRAWARRAYSINDIRECTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWARRAYSINDIRECTPROC.class, fi, constants$343.PFNGLMULTIDRAWARRAYSINDIRECTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;II)V", scope);
    }
    static PFNGLMULTIDRAWARRAYSINDIRECTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1, int x2, int x3) -> {
            try {
                constants$343.PFNGLMULTIDRAWARRAYSINDIRECTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

