// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIB4UBNVPROC {

    void apply(int x0, byte x1, byte x2, byte x3, byte x4);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB4UBNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB4UBNVPROC.class, fi, constants$866.PFNGLVERTEXATTRIB4UBNVPROC$FUNC, "(IBBBB)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB4UBNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB4UBNVPROC.class, fi, constants$866.PFNGLVERTEXATTRIB4UBNVPROC$FUNC, "(IBBBB)V", scope);
    }
    static PFNGLVERTEXATTRIB4UBNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, byte x1, byte x2, byte x3, byte x4) -> {
            try {
                constants$866.PFNGLVERTEXATTRIB4UBNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


