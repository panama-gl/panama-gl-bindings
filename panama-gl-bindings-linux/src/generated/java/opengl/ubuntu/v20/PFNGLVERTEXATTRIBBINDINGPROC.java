// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIBBINDINGPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBBINDINGPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBBINDINGPROC.class, fi, constants$263.PFNGLVERTEXATTRIBBINDINGPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBBINDINGPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBBINDINGPROC.class, fi, constants$263.PFNGLVERTEXATTRIBBINDINGPROC$FUNC, "(II)V", scope);
    }
    static PFNGLVERTEXATTRIBBINDINGPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$263.PFNGLVERTEXATTRIBBINDINGPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


