// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETPROGRAMSTRINGARBPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETPROGRAMSTRINGARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETPROGRAMSTRINGARBPROC.class, fi, constants$414.PFNGLGETPROGRAMSTRINGARBPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETPROGRAMSTRINGARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETPROGRAMSTRINGARBPROC.class, fi, constants$414.PFNGLGETPROGRAMSTRINGARBPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETPROGRAMSTRINGARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$414.PFNGLGETPROGRAMSTRINGARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


