// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETFRAGDATALOCATIONPROC {

    int apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGETFRAGDATALOCATIONPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETFRAGDATALOCATIONPROC.class, fi, constants$245.PFNGLGETFRAGDATALOCATIONPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLGETFRAGDATALOCATIONPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETFRAGDATALOCATIONPROC.class, fi, constants$245.PFNGLGETFRAGDATALOCATIONPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLGETFRAGDATALOCATIONPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                return (int)constants$245.PFNGLGETFRAGDATALOCATIONPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


