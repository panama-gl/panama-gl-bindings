// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIBI4IPROC {

    void apply(int x0, int x1, int x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBI4IPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI4IPROC.class, fi, constants$238.PFNGLVERTEXATTRIBI4IPROC$FUNC, "(IIIII)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBI4IPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI4IPROC.class, fi, constants$238.PFNGLVERTEXATTRIBI4IPROC$FUNC, "(IIIII)V", scope);
    }
    static PFNGLVERTEXATTRIBI4IPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4) -> {
            try {
                constants$238.PFNGLVERTEXATTRIBI4IPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


