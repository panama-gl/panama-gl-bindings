// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGENVERTEXARRAYSPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGENVERTEXARRAYSPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGENVERTEXARRAYSPROC.class, fi, constants$259.PFNGLGENVERTEXARRAYSPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGENVERTEXARRAYSPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGENVERTEXARRAYSPROC.class, fi, constants$259.PFNGLGENVERTEXARRAYSPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGENVERTEXARRAYSPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$259.PFNGLGENVERTEXARRAYSPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


