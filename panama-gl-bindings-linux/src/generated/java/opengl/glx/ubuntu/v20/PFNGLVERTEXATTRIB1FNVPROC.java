// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIB1FNVPROC {

    void apply(int x0, float x1);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB1FNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB1FNVPROC.class, fi, constants$944.PFNGLVERTEXATTRIB1FNVPROC$FUNC, "(IF)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB1FNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB1FNVPROC.class, fi, constants$944.PFNGLVERTEXATTRIB1FNVPROC$FUNC, "(IF)V", scope);
    }
    static PFNGLVERTEXATTRIB1FNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1) -> {
            try {
                constants$944.PFNGLVERTEXATTRIB1FNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


