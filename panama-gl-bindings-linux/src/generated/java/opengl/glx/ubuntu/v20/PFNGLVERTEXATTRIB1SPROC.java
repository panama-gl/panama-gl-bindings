// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIB1SPROC {

    void apply(int x0, short x1);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB1SPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB1SPROC.class, fi, constants$218.PFNGLVERTEXATTRIB1SPROC$FUNC, "(IS)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB1SPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB1SPROC.class, fi, constants$218.PFNGLVERTEXATTRIB1SPROC$FUNC, "(IS)V", scope);
    }
    static PFNGLVERTEXATTRIB1SPROC ofAddress(MemoryAddress addr) {
        return (int x0, short x1) -> {
            try {
                constants$218.PFNGLVERTEXATTRIB1SPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

