// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLWEIGHTFVARBPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLWEIGHTFVARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLWEIGHTFVARBPROC.class, fi, constants$379.PFNGLWEIGHTFVARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLWEIGHTFVARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLWEIGHTFVARBPROC.class, fi, constants$379.PFNGLWEIGHTFVARBPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLWEIGHTFVARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$379.PFNGLWEIGHTFVARBPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


