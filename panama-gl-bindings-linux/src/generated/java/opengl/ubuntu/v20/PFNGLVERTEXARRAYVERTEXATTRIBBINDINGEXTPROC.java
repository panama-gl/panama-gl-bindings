// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC.class, fi, constants$619.PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC.class, fi, constants$619.PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC$FUNC, "(III)V", scope);
    }
    static PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$619.PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


